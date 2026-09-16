package model;

import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> productList;
    private OrderStatus orderStatus;

    /*
    Todavía faltan más cosas en esta clase, pero no sé como las vamos a implementar:
    precio de cada producto; -> esto considero se tiene en la lista de productos
    cantidad solicitada; -> podría ser un atributo de producto...
    existencia disponible; -> podría ser un atributo de producto como su propio stock
    subtotal; -> está la clase CalculateSubtotal ( puede ser una función getSubtotal() )
    descuento; -> está la clase ApplyDiscount (aquí es supongo para ver el descuento aplicado)
    impuestos; -> está la clase CalculateTaxes (aquí es supongo para ver el impuesto aplicado)
    total; -> puede ser una función getTotal()
     */
}
