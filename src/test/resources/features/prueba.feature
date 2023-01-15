#Autor: Jhon Quiñones Arboleda
#language: es

@HistoriaDeUsuario
Característica: Verificar el ingreso correcto al sitio Éxito y elegir los productos de compra

  @CasoLogueo:
  Escenario: Verificar el ingreso correcto al sitio Éxito y elegir los productos de compra
    Dado que jhon ingreso a la pagina web del Éxito
    Cuando elija una categoría y subcategoría
    Y Seleccione #5 productos aleatoreamente
    Y cada unos de los productos tenga cantidades aleatoreas entre 1-10
    Entonces Se debe validar que el nombre de los productos agregados deberá ser igual que en el carrito
    Y El total de los precios de los productos agregados deberá ser igual que en el carrito
    Y Las cantidades de los productos agregados deberá ser igual que en el carrito
    Y El número de productos agregados debe ser igual que en el carrito