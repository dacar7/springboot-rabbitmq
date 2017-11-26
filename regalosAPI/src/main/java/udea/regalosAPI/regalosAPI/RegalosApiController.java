package udea.regalosAPI.regalosAPI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import udea.regalosAPI.regalosAPI.modelo.Regalo;
import udea.regalosAPI.regalosAPI.rabbitconf.Publicador;

/**
 * Created by David on 25/11/2017.
 */
@RestController
public class RegalosApiController {

  Publicador publicador = new Publicador();

  @RequestMapping(method = RequestMethod.POST, value = "/regalo")
  public ResponseEntity<Regalo> crearRegalo(@RequestBody Regalo regalo){
    publicador.publicarMensajeAsnc("udea.regalos.regalovendido", regalo.getTipo(), regalo.getNombre());
    return new ResponseEntity<Regalo>(HttpStatus.OK);
  }
}
