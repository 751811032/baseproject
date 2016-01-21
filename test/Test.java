
import com.ct855.util.HttpsClientUtil;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class Test {

    public void test() {

        try {
            String ss = "--->>" + HttpsClientUtil.getUrl("https://api.fantasydata.net/nba/v2/JSON/teams");
            System.out.println(ss);
        } catch (IOException iOException) {
        } catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        } catch (KeyManagementException keyManagementException) {
        } catch (NoSuchProviderException noSuchProviderException) {
        }

    }

}
