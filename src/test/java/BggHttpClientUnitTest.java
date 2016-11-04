package test.java;

/**
 * Created by adamscharf on 11/4/16.
 */
public class BggHttpClientUnitTest {

    @Test
    public void ShouldCreateBggHttpClient() {
        BGGHTTPClient bgghttpclient = new BGGHTTPClient();
        assertNotNull(bgghttpclient);
    }
}
