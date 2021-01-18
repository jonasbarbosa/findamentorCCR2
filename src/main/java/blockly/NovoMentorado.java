package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;
import org.springframework.data.domain.*;
import org.springframework.validation.annotation.*;
import org.springframework.web.bind.annotation.*;


/** 
* 
* RestController @generated 
* 
*/ 

@RestController
@RequestMapping(value = "/api/rest/main/NovoMentorado")

@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class NovoMentorado {

public static final int TIMEOUT = 300;

/**
 *
 * @param login
 * @param email
 * @param senha
 * @param name
 * @return Var
 */

@RequestMapping(method = RequestMethod.GET, value="/cad/{login}/{email}/{senha}/{name}")
// novoMentorado
public static Var cad(@PathVariable("login") Var login ,@PathVariable("email") Var email ,@PathVariable("senha") Var senha ,@PathVariable("name") Var name ) throws Exception {
 return new Callable<Var>() {

   private Var rd = Var.VAR_NULL;
   private Var type2 = Var.VAR_NULL;

   public Var call() throws Exception {

    rd =
    cronapi.util.Operations.random(
    Var.valueOf(150000));

    type2 =
    Var.valueOf("mentorado");

    cronapi.database.Operations.insert(Var.valueOf("app.entity.User"),Var.valueOf("tipo",type2),Var.valueOf("emailConfirmed",rd),Var.valueOf("normalizedUserName",rd),Var.valueOf("lockoutEnabled",rd),Var.valueOf("pontos",Var.VAR_NULL),Var.valueOf("normalizedEmail",rd),Var.valueOf("userName",login),Var.valueOf("phoneNumberConfirmed",rd),Var.valueOf("picture",Var.VAR_NULL),Var.valueOf("perfil",Var.VAR_NULL),Var.valueOf("twoFactorEnabled",rd),Var.valueOf("password",senha),Var.valueOf("phoneNumber",rd),Var.valueOf("name",name),Var.valueOf("theme",Var.VAR_NULL),Var.valueOf("accessFailedCount",rd),Var.valueOf("id",rd),Var.valueOf("email",email),Var.valueOf("securityStamp",rd),Var.valueOf("lockoutEnd",rd));

    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf("Seu cadastro foi realizado com sucesso!!"));

    System.out.println(rd.getObjectAsString());

    cronapi.util.Operations.sleep(
    Var.valueOf(2));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/app/login"));
    return Var.VAR_NULL;
   }
 }.call();
}

}

