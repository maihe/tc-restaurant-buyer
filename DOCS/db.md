## Mermaid


```mermaid
erDiagram

    PRODUCT ||--o{ PURCHASE-ORDER-PRODUCT : "faz parte"
    PRODUCT ||--o{ PRODUCT-CUSTOMER : "faz parte"
    PURCHASE-ORDER-PRODUCT }|--|| PURCHASE-ORDER : "faz parte"
    CUSTOMER ||--|{ PRODUCT-CUSTOMER : "possui"
    CUSTOMER ||--|{ PURCHASE-ORDER : "possui"
    SUPPLIER ||--|{ PURCHASE-ORDER : "faz parte"
    USER ||--o{ PURCHASE-ORDER : "faz"
    USER }|--|| ROLE : "is"
    USER }o--|| CUSTOMER : "tem"


    PRODUCT {
        long productId
        string name
        string units
        string category
    }


    PRODUCT-CUSTOMER {
        long productId
        long customerId
        int quantity
        int minQuantity
        int maxQuantity
    }


    PURCHASE-ORDER-PRODUCT{
        long purchaseOrderId
        long productId
        int quantityBuy
        int price
    }


    PURCHASE-ORDER {
        long purchaseOrderId
        long customerId
        long supplierId
        long userId
        long totalValue
        datetime createDate
        datetime deliveryDate

    }


    CUSTOMER {
        long customerId
        string cnpj
        long authorizedBudget
    }

    USER {
        long userId
        string name
        string login
        string password
        long idRole
        long customerId
    }

    ROLE {
        long idRole
        string name
        string level
    }

    SUPPLIER {
        long supplierId
        string cnpj
    }
```