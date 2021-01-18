window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.CtrlPage = window.blockly.js.blockly.CtrlPage || {};

/**
 * ctrlPage
 */
window.blockly.js.blockly.CtrlPage.controlPage = async function() {
 var item;
  await this.cronapi.util.callServerBlocklyNoReturn('blockly.StartQuestion:init');
  this.cronapi.screen.load("perguntas");
  console.log(this.cronapi.screen.getValueOfField("params.pag"));
}
