window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.DebugServe = window.blockly.js.blockly.DebugServe || {};

/**
 * debugServe
 */
window.blockly.js.blockly.DebugServe.url = async function() {
 var item, srvFn, x;
  this.cronapi.screen.createScopeVariable('serve', this.cronapi.util.getBaseUrl());
  this.cronapi.screen.changeValueOfField("question.active.pts", this.cronapi.screen.getScopeVariable('serve'));
}
