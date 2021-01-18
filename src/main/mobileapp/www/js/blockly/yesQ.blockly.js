window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.YesQ = window.blockly.js.blockly.YesQ || {};

/**
 * yesQ
 */
window.blockly.js.blockly.YesQ.pts = async function() {
 var item, atualPts, indi, no, sim, x;
  indi = 5;
  atualPts = this.cronapi.screen.getValueOfField("User.active.pontos");
  await this.cronapi.util.sleep(1);
  this.cronapi.screen.changeValueOfField("User.active.pontos", (indi + atualPts));
  this.cronapi.screen.post("User");
  console.log(atualPts);
}
