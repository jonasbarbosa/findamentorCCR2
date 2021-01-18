window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.NovoMentorado = window.blockly.js.blockly.NovoMentorado || {};

function mathRandomInt(a, b) {
  if (a > b) {
    // Swap a and b to ensure a is smaller.
    var c = a;
    a = b;
    b = c;
  }
  return Math.floor(Math.random() * (b - a + 1) + a);
}

/**
 * novoMentorado
 */
window.blockly.js.blockly.NovoMentorado.Mentorado = async function(login, name2, senha, email) {
 var item, name, type;
  x = mathRandomInt(1, 200000);
  type = 'cf2e4e05-c7ce-4333-b7bc-3fd20ee5a137';
  this.cronapi.screen.changeValueOfField("UserSecurable.active.securable_id", type);
  this.cronapi.screen.changeValueOfField("UserSecurable.active.user_id", x);
  this.cronapi.screen.changeValueOfField("newUsers.active.id", x);
  this.cronapi.screen.changeValueOfField("newUsers.active.accessFailedCount", mathRandomInt(1, 200000));
  this.cronapi.screen.changeValueOfField("newUsers.active.emailConfirmed", mathRandomInt(1, 200000));
  this.cronapi.screen.changeValueOfField("newUsers.active.lockoutEnabled", mathRandomInt(1, 200000));
  this.cronapi.screen.changeValueOfField("newUsers.active.lockoutEnd", mathRandomInt(1, 200000));
  this.cronapi.screen.changeValueOfField("newUsers.active.normalizedEmail", mathRandomInt(1, 200000));
  this.cronapi.screen.changeValueOfField("newUsers.active.normalizedUserName", login);
  this.cronapi.screen.changeValueOfField("newUsers.active.phoneNumber", mathRandomInt(1, 200000));
  this.cronapi.screen.changeValueOfField("newUsers.active.phoneNumberConfirmed", mathRandomInt(1, 200000));
  this.cronapi.screen.changeValueOfField("newUsers.active.securityStamp", mathRandomInt(1, 200000));
  this.cronapi.screen.changeValueOfField("newUsers.active.theme", null);
  this.cronapi.screen.changeValueOfField("newUsers.active.twoFactorEnabled", mathRandomInt(1, 200000));
  this.cronapi.screen.changeValueOfField("newUsers.active.name", name2);
  this.cronapi.screen.changeValueOfField("newUsers.active.userName", login);
  this.cronapi.screen.changeValueOfField("newUsers.active.email", email);
  this.cronapi.screen.changeValueOfField("newUsers.active.password", senha);
  this.cronapi.screen.changeValueOfField("newUsers.active.tipo", x);
  this.cronapi.screen.post("newUsers");
  this.cronapi.screen.post("UserSecurable");
  this.cronapi.screen.notify('success',String(name2) + String(' Seu cadastro foi realizado com sucesso!!'));
}
