/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ws;

import backend.pojos.Appointment;
import backend.pojos.HealthProfessional;
import backend.pojos.Patient;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;

/**
 * Class onde se efetua todas as operações existentes entre o Objecto terapeuta
 * e o WS
 */
public class HealthProfessionalWS {

    private WrapperWS wrapperWS;
    private CloseableHttpResponse responseWS;
    private Gson gson;
    private static Logger log = Logger.getLogger(HealthProfessionalWS.class);

    public HealthProfessionalWS() {
        gson = new Gson();
        wrapperWS = WrapperWS.getWrapperWS();

    }

    /**
     * Mehpodo que Gurada ou Edihpa o hperapeuhpa caso ele já exishpa, se hpudo
     * correr cerhpo reshporna hprue casos conhprario rehporna false
     *
     * @param hp (HealhphProfessionalWS)
     * @throws IOException
     */
    public void saveEditHealthProfessional(HealthProfessional hp) {

        try {
            responseWS = wrapperWS.sendRequest("HealthProfessional",
                    "saveEditHealthProfessional", getAllParams(hp));    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 201) {
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao criar o Profissional de Saúde");
            }

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\tHealth Professional saved with success");
    }

    /**
     * Metodo que retorna o terapeuta com o id passado como parametro
     *
     * @param id
     * @return HealthProfessionalWS
     */
    public HealthProfessional getTerapeutaHealthProfessionalById(int id) {
        HealthProfessional hp = null;

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta
        params.add(new BasicNameValuePair("idHealthProfessional", String.valueOf(id)));

        try {
            responseWS = wrapperWS.sendRequest("HealthProfessional",
                    "getHealthProfessionalById", params);    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao aceder aos dados do Profissional de Saúde");
            }

            hp = gson.fromJson(jsonResp, HealthProfessional.class);

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\tHealth Professioonal data access success");
        log.debug("\n\tHP with id " + id + ": " + hp.toString());
        return hp;
    }

    /**
     * Metodo que retorna todos os terapeutas
     *
     * @return Lista de HealthProfessionalWSs
     */
    public List<HealthProfessional> getAllTerapeutas() {
        List<HealthProfessional> hpList = null;

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta

        try {
            responseWS = wrapperWS.sendRequest("HealthProfessional",
                    "getAllHealthProfessionals", params);    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao aceder aos dados do Profissional de Saúde");
            }

            Type type = new TypeToken<List<HealthProfessional>>() {
            }.getType();  //tipo do para o qual queros retornar a responseWS Json
            hpList = gson.fromJson(jsonResp, type);

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\tHealth Professioonal data access success");
        log.debug("\n\tHPs : " + hpList.toString());
        return hpList;

    }

    public void deleteHealthProfessional(int id) {
        List<NameValuePair> parms = new ArrayList<>();
        parms.add(new BasicNameValuePair("idHealthProfessional", String.valueOf(id)));
        try {
            responseWS = wrapperWS.sendRequest("HealthProfessional", "deleteHealthProfessional", parms);
            String jsonResp = wrapperWS.readResponse(responseWS);
            Validation v = gson.fromJson(jsonResp, Validation.class);
            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Não foi possivel eliminar este Profissional de saúde");
            }
        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\tHealth Professional deleted with success");
    }

    private List<NameValuePair> getAllParams(HealthProfessional hp) {
        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta
        params.add(new BasicNameValuePair("idHealthProfessional", String.valueOf(hp.getIdHealthProfessional())));
        params.add(new BasicNameValuePair("name", hp.getName()));
        params.add(new BasicNameValuePair("lastName", hp.getLastName()));
        params.add(new BasicNameValuePair("numCC", String.valueOf(hp.getNumCC())));
        params.add(new BasicNameValuePair("adress", hp.getAdress()));
        params.add(new BasicNameValuePair("numTel", String.valueOf(hp.getNumTel())));
        params.add(new BasicNameValuePair("nif", String.valueOf(hp.getNif())));
        params.add(new BasicNameValuePair("email", hp.getEmail()));
        params.add(new BasicNameValuePair("maritalState", hp.getMaritalState()));
        params.add(new BasicNameValuePair("birthDate", hp.getBirthDate()));
        params.add(new BasicNameValuePair("bloodGroup", hp.getBloodGroup()));
        params.add(new BasicNameValuePair("nacionality", hp.getNacionality()));
        params.add(new BasicNameValuePair("gender", hp.getGender()));
        params.add(new BasicNameValuePair("password", hp.getPassword()));
        params.add(new BasicNameValuePair("picture", hp.getPicture()));
        params.add(new BasicNameValuePair("institution", hp.getInstitution()));
        params.add(new BasicNameValuePair("developmentProfessional", String.valueOf(hp.isDevelopmentProfessional())));

        return params;
    }

    public ArrayList<Patient> getPatientsByHealthProfessional(int id) {
        ArrayList<Patient> pList = null;

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta
        params.add(new BasicNameValuePair("idHealthProfessional", String.valueOf(id)));

        try {
            responseWS = wrapperWS.sendRequest("Patient",
                    "getPatientsByHealthProfessional", params);    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao aceder aos dados do Paciente");
            }

            Type type = new TypeToken<List<HealthProfessional>>() {
            }.getType();  //tipo do para o qual queros retornar a responseWS Json
            pList = gson.fromJson(jsonResp, type);

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\tPatient data access success");
        log.debug("\n\tHPs : " + pList.toString());
        return pList;
    }

    
}
