package com.jaureguialzo.euskalmet;

import okhttp3.*;

import java.io.IOException;
import java.util.Arrays;

/**
 * Leer un feed XML desde Open Data Euskadi usando la librería OkHttp
 */
public class Euskalmet {

    // REF: Euskalmet - Open Data Euskadi: http://opendata.euskadi.eus/catalogo/-/prediccion-meteorologica-de-2018/

    public static String tendenciaSeisDias() {

        String respuesta = null;

        // REF: Librería para comunicaciones HTTP: http://square.github.io/okhttp/
        OkHttpClient client = new OkHttpClient.Builder()
                .connectionSpecs(Arrays.asList(ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT))
                .addInterceptor(new EncodingInterceptor())
                .build();

        Request request = new Request.Builder()
                .url("http://opendata.euskadi.eus/contenidos/tendencias/met_tendency/opendata/met_tendency.xml")
                .get()
                .addHeader("cache-control", "no-cache")
                .build();

        try {
            Response response = client.newCall(request).execute();
            if (response.body() != null) {
                respuesta = response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return respuesta;
    }

    public static void main(String[] args) {
        System.out.println("--- Euskalmet XML, tendencia para 6 días ---\n");
        System.out.println(tendenciaSeisDias());
    }

    // REF: Corregir la codificación erronea del servidor OpenData: https://stackoverflow.com/a/45285135
    private static class EncodingInterceptor implements Interceptor {

        @Override
        public Response intercept(Chain chain) throws IOException {
            Response response = chain.proceed(chain.request());
            MediaType mediaType = MediaType.parse("application/json; charset=iso-8859-1");
            ResponseBody modifiedBody = ResponseBody.create(mediaType, response.body().bytes());

            return response.newBuilder()
                    .body(modifiedBody)
                    .build();
        }
    }

}
