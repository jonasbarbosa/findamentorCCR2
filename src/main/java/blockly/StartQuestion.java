package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class StartQuestion {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// startQuestion
public static Var init() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 */
// Descreva esta função...
public static void DontKnow() throws Exception {
  new Callable<Var>() {

   private Var atualPts = Var.VAR_NULL;
   private Var positPTS = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {

    atualPts =
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.pontos from User u where u.userName = :userName"),Var.valueOf("userName",
    cronapi.util.Operations.getCurrentUserName()))));

    positPTS =
    cronapi.math.Operations.sum(atualPts,
    Var.valueOf(3));

    item =
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("PUT"),
    Var.valueOf("application/json"),
    Var.valueOf(
    Var.valueOf("https://app-28-155-62592.ide.cronapp.io/").toString() +
    Var.valueOf("api/cronapi/odata/v2/app/User").toString() +
    Var.valueOf("(\'").toString() +
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("User.active.id")).toString() +
    Var.valueOf("\')").toString()),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("pontos",positPTS)),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("X-AUTH-TOKEN",
    cronapi.screen.Operations.getToken())), Var.VAR_NULL);

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("User"),
    Var.valueOf("true"));

    System.out.println(positPTS.getObjectAsString());
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var atualPTS() throws Exception {
 return new Callable<Var>() {

   private Var atualQ = Var.VAR_NULL;
   private Var tela = Var.VAR_NULL;
   private Var calcQ = Var.VAR_NULL;
   private Var newQ = Var.VAR_NULL;
   private Var atualPts = Var.VAR_NULL;
   private Var positPTS = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param tela
 * @return Var
 */
// Descreva esta função...
public static Var btns(Var tela) throws Exception {
 return new Callable<Var>() {

   private Var atualQ = Var.VAR_NULL;
   private Var calcQ = Var.VAR_NULL;
   private Var newQ = Var.VAR_NULL;

   public Var call() throws Exception {

    atualQ = tela;

    calcQ =
    cronapi.conversion.Operations.convert(atualQ,
    Var.valueOf("INTEGER"));

    newQ =
    cronapi.math.Operations.sum(calcQ,
    Var.valueOf(1));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("params.pag"), newQ);

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.load"),
    Var.valueOf("perguntas"));

    positivo();

    if (
    Var.valueOf(atualQ.compareTo(
    Var.valueOf(24)) >= 0).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Calculando perfil, por favor aguarde."));

        ptsEnd();

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/app/logged/posPTS"));
    }
    return newQ;
   }
 }.call();
}

/**
 *
 * @param tela
 * @return Var
 */
// Descreva esta função...
public static Var btnsDkkow(Var tela) throws Exception {
 return new Callable<Var>() {

   private Var atualQ = Var.VAR_NULL;
   private Var calcQ = Var.VAR_NULL;
   private Var newQ = Var.VAR_NULL;

   public Var call() throws Exception {

    atualQ = tela;

    calcQ =
    cronapi.conversion.Operations.convert(atualQ,
    Var.valueOf("INTEGER"));

    newQ =
    cronapi.math.Operations.sum(calcQ,
    Var.valueOf(1));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("params.pag"), newQ);

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.load"),
    Var.valueOf("perguntas"));

    System.out.println(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("params.pag")).getObjectAsString());

    DontKnow();

    if (
    Var.valueOf(atualQ.compareTo(
    Var.valueOf(25)) >= 0).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Calculando perfil, por favor aguarde."));

        ptsEnd();

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/app/logged/posPTS"));
    }
    return newQ;
   }
 }.call();
}

/**
 *
 * @param tela
 * @return Var
 */
// Descreva esta função...
public static Var btnsNO(Var tela) throws Exception {
 return new Callable<Var>() {

   private Var atualQ = Var.VAR_NULL;
   private Var calcQ = Var.VAR_NULL;
   private Var newQ = Var.VAR_NULL;

   public Var call() throws Exception {

    atualQ = tela;

    calcQ =
    cronapi.conversion.Operations.convert(atualQ,
    Var.valueOf("INTEGER"));

    newQ =
    cronapi.math.Operations.sum(calcQ,
    Var.valueOf(1));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("params.pag"), newQ);

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.load"),
    Var.valueOf("perguntas"));

    negativo();

    System.out.println(
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("params.pag")).getObjectAsString());

    if (
    Var.valueOf(atualQ.compareTo(
    Var.valueOf(25)) >= 0).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Calculando perfil, por favor aguarde."));

        ptsEnd();

        cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeView"), Var.valueOf("#/app/logged/posPTS"));
    }
    return newQ;
   }
 }.call();
}

/**
 *
 * @param tela
 * @return Var
 */
// Descreva esta função...
public static Var btnsPro1(Var tela) throws Exception {
 return new Callable<Var>() {

   private Var atualQ = Var.VAR_NULL;
   private Var calcQ = Var.VAR_NULL;
   private Var newQ = Var.VAR_NULL;

   public Var call() throws Exception {

    atualQ = tela;

    calcQ =
    cronapi.conversion.Operations.convert(atualQ,
    Var.valueOf("INTEGER"));

    newQ =
    cronapi.math.Operations.sum(calcQ,
    Var.valueOf(1));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("params.pag"), newQ);

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.load"),
    Var.valueOf("perguntas"));

    prov1();

    if (
    Var.valueOf(atualQ.compareTo(
    Var.valueOf(25)) >= 0).getObjectAsBoolean()) {

        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
        Var.valueOf("Calculando perfil, por favor aguarde."));

        ptsEnd();
    }
    return newQ;
   }
 }.call();
}

/**
 */
// Descreva esta função...
public static void negativo() throws Exception {
  new Callable<Var>() {

   private Var atualPts = Var.VAR_NULL;
   private Var positPTS = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {

    atualPts =
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.pontos from User u where u.userName = :userName"),Var.valueOf("userName",
    cronapi.util.Operations.getCurrentUserName()))));

    positPTS =
    cronapi.math.Operations.sum(atualPts,
    Var.valueOf(0));

    item =
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("PUT"),
    Var.valueOf("application/json"),
    Var.valueOf(
    Var.valueOf("https://app-28-155-62592.ide.cronapp.io/").toString() +
    Var.valueOf("api/cronapi/odata/v2/app/User").toString() +
    Var.valueOf("(\'").toString() +
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("User.active.id")).toString() +
    Var.valueOf("\')").toString()),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("pontos",positPTS)),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("X-AUTH-TOKEN",
    cronapi.screen.Operations.getToken())), Var.VAR_NULL);

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("User"),
    Var.valueOf("true"));

    System.out.println(positPTS.getObjectAsString());
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 */
// Descreva esta função...
public static void positivo() throws Exception {
  new Callable<Var>() {

   private Var atualPts = Var.VAR_NULL;
   private Var positPTS = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {

    atualPts =
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.pontos from User u where u.userName = :userName"),Var.valueOf("userName",
    cronapi.util.Operations.getCurrentUserName()))));

    cronapi.util.Operations.sleep(
    Var.valueOf(2));

    positPTS =
    cronapi.math.Operations.sum(atualPts,
    Var.valueOf(5));

    item =
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("PUT"),
    Var.valueOf("application/json"),
    Var.valueOf(
    Var.valueOf("https://app-28-155-62592.ide.cronapp.io/").toString() +
    Var.valueOf("api/cronapi/odata/v2/app/User").toString() +
    Var.valueOf("(\'").toString() +
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("User.active.id")).toString() +
    Var.valueOf("\')").toString()),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("pontos",positPTS)),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("X-AUTH-TOKEN",
    cronapi.screen.Operations.getToken())), Var.VAR_NULL);

    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("info"),
    Var.valueOf("Você respondeu: SIM"));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("User"),
    Var.valueOf("true"));

    System.out.println(positPTS.getObjectAsString());
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 */
// Descreva esta função...
public static void prov1() throws Exception {
  new Callable<Var>() {

   private Var atualPts = Var.VAR_NULL;
   private Var positPTS = Var.VAR_NULL;
   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {

    atualPts =
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.pontos from User u where u.userName = :userName"),Var.valueOf("userName",
    cronapi.util.Operations.getCurrentUserName()))));

    cronapi.util.Operations.sleep(
    Var.valueOf(2));

    positPTS =
    cronapi.math.Operations.sum(atualPts,
    Var.valueOf(1));

    item =
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("PUT"),
    Var.valueOf("application/json"),
    Var.valueOf(
    Var.valueOf("https://app-28-155-62592.ide.cronapp.io/").toString() +
    Var.valueOf("api/cronapi/odata/v2/app/User").toString() +
    Var.valueOf("(\'").toString() +
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("User.active.id")).toString() +
    Var.valueOf("\')").toString()),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("pontos",positPTS)),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("X-AUTH-TOKEN",
    cronapi.screen.Operations.getToken())), Var.VAR_NULL);

    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("info"),
    Var.valueOf("Você respondeu: SIM"));

    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.refreshDatasource"),
    Var.valueOf("User"),
    Var.valueOf("true"));

    System.out.println(positPTS.getObjectAsString());
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 */
// Descreva esta função...
public static void ptsEnd() throws Exception {
  new Callable<Var>() {

   private Var atualPts = Var.VAR_NULL;
   private Var fonte = Var.VAR_NULL;

   public Var call() throws Exception {

    fonte =
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.perfil from User u where u.userName = :userName"),Var.valueOf("userName",
    cronapi.util.Operations.getCurrentUserName()));

    atualPts =
    cronapi.list.Operations.getFirst((
    cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.pontos from User u where u.userName = :userName"),Var.valueOf("userName",
    cronapi.util.Operations.getCurrentUserName()))));

    if (
    Var.valueOf(atualPts.compareTo(
    Var.valueOf(0)) <= 0).getObjectAsBoolean()) {

        cronapi.database.Operations.updateField(fonte,
        Var.valueOf("perfil"),
        Var.valueOf("Ciências Humanas"));
    } else {

        if (
        Var.valueOf(atualPts.compareTo(
        Var.valueOf(12)) <= 0).getObjectAsBoolean()) {

            cronapi.database.Operations.updateField(fonte,
            Var.valueOf("perfil"),
            Var.valueOf("Ciências Biológicas"));
        } else {

            if (
            Var.valueOf(atualPts.compareTo(
            Var.valueOf(24)) <= 0).getObjectAsBoolean()) {

                cronapi.database.Operations.updateField(fonte,
                Var.valueOf("perfil"),
                Var.valueOf("Ciências da Saúde"));
            } else {

                if (
                Var.valueOf(atualPts.compareTo(
                Var.valueOf(35)) <= 0).getObjectAsBoolean()) {

                    cronapi.database.Operations.updateField(fonte,
                    Var.valueOf("perfil"),
                    Var.valueOf(" Ciências Agrárias"));
                } else {

                    if (
                    Var.valueOf(atualPts.compareTo(
                    Var.valueOf(50)) <= 0).getObjectAsBoolean()) {

                        cronapi.database.Operations.updateField(fonte,
                        Var.valueOf("perfil"),
                        Var.valueOf("Ciências Sociais Aplicadas"));
                    } else {

                        if (
                        Var.valueOf(atualPts.compareTo(
                        Var.valueOf(75)) <= 0).getObjectAsBoolean()) {

                            cronapi.database.Operations.updateField(fonte,
                            Var.valueOf("perfil"),
                            Var.valueOf("Engenharias"));
                        } else {

                            if (
                            Var.valueOf(atualPts.compareTo(
                            Var.valueOf(100)) <= 0).getObjectAsBoolean()) {

                                cronapi.database.Operations.updateField(fonte,
                                Var.valueOf("perfil"),
                                Var.valueOf("Ciências Exatas e da Terra"));
                            } else {

                                if (
                                Var.valueOf(atualPts.compareTo(
                                Var.valueOf(120)) <= 0).getObjectAsBoolean()) {

                                    cronapi.database.Operations.updateField(fonte,
                                    Var.valueOf("perfil"),
                                    Var.valueOf(" Linguística, Letras e Artes"));
                                } else {
                                  {}
                                }
                            }
                        }
                    }
                }
            }
        }
    }
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var token() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {

    item =
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("POST"),
    Var.valueOf("application/x-www-form-urlencoded"),
    Var.valueOf(
    Var.valueOf("https://app-28-155-12490.ide.cronapp.io/").toString() +
    Var.valueOf("/auth").toString()),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("username",
    Var.valueOf("admin")) , Var.valueOf("password",
    Var.valueOf("admin"))), Var.VAR_NULL, Var.VAR_NULL);

    System.out.println(
    cronapi.screen.Operations.getToken().getObjectAsString());
    return
cronapi.json.Operations.getJsonOrMapField(
cronapi.json.Operations.toJson(item),
Var.valueOf("token"));
   }
 }.call();
}

}

