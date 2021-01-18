window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ModalLogin = window.blockly.js.blockly.ModalLogin || {};

/**
 * ModalLogin
 */
window.blockly.js.blockly.ModalLogin.abrir = async function() {
 var item;
  this.cronapi.screen.showIonicModal("modal39878");
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.ModalLogin.fechar = async function() {
 var item;
  this.cronapi.screen.hideIonicModal("modal39878");
}
