/**
 * @class La clase Cilindro crea nuevas instancias con un radio y altura determinada
 */
function Cilindro(){
  /**
   * @type {number}
   */
  this.volumen = 0;
  /**
   * @description Determina el volumen de un cilindro con la altura y radio especificado
   * @param {number} radio El radio de los círculos laterales del cilindro
   * @param {number} altura La altura del cilindro
   * @return {number}
   */
  this.volumen = function obtenerVolumen(radio, altura) {
    const volumen = (Math.PI * Math.pow(radio, 2) * altura);
    return volumen;
  };
}
