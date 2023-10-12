## Marmeid

[![](https://mermaid.ink/img/pako:eNqFk8FuwjAMhl8lyhleoDcGSEPaBrR0Jy5RY0q2NukcZxsDHmjPsRdbWjoobdFyqJrfdmJ_sfc8MRJ4wAEnSqQo8rVmfp2-i3A-iccrdjTD4WHPFnE4vh9F0-E8nExDFrA1L4y1Tq15X9T-tC1XZnTKCjTSJTSTF90SKm9BsCQcCk2xU12zFjlcRKWJvTnvq2jXcXVakb32zcXnsuNeGZRe3jonEQSpwdpwvCrvmkLF5sDCabQaxeHoaVVx-flmG1BkWGGwRac3PIoXi4dZDdUHgyaE1MG_8R3IDpOtsDBHCdhEXVnJkMieReYaPKUvlVQOTEKm3gF3Ey_UdbPmzY0S27deHnAm_wxdprp4acUJR1uD6gvknZMp0Bn36SeObgLua7zKvZ2as9ccenuqFjOTKt1RC2Hth8GetjUZtDI-v2M7DeuKIlO9qVy4HPmA54C5UNKPZHXEmtMWfKq8LFoKfC1LLv08OhPtdMIDQgcD7oryIesh5sFGZNarIH0T4uNpxqtRP_4CYMgwXw?type=png)](https://mermaid.live/edit#pako:eNqFk8FuwjAMhl8lyhleoDcGSEPaBrR0Jy5RY0q2NukcZxsDHmjPsRdbWjoobdFyqJrfdmJ_sfc8MRJ4wAEnSqQo8rVmfp2-i3A-iccrdjTD4WHPFnE4vh9F0-E8nExDFrA1L4y1Tq15X9T-tC1XZnTKCjTSJTSTF90SKm9BsCQcCk2xU12zFjlcRKWJvTnvq2jXcXVakb32zcXnsuNeGZRe3jonEQSpwdpwvCrvmkLF5sDCabQaxeHoaVVx-flmG1BkWGGwRac3PIoXi4dZDdUHgyaE1MG_8R3IDpOtsDBHCdhEXVnJkMieReYaPKUvlVQOTEKm3gF3Ey_UdbPmzY0S27deHnAm_wxdprp4acUJR1uD6gvknZMp0Bn36SeObgLua7zKvZ2as9ccenuqFjOTKt1RC2Hth8GetjUZtDI-v2M7DeuKIlO9qVy4HPmA54C5UNKPZHXEmtMWfKq8LFoKfC1LLv08OhPtdMIDQgcD7oryIesh5sFGZNarIH0T4uNpxqtRP_4CYMgwXw)

```mermaid
erDiagram
    
    PRODUCT }o--|{ PURCHASE-ORDER : "possui"
    
    PRODUCT {
        long productId
        string restaurantUuid
        string name
        int quantity
        string units
        int maxQuantity
        int minQuantity
        string category
    }
    
    PURCHASE-ORDER }o--|| RESTAURANT : "é feito por"
    
    PURCHASE-ORDER }o--|| SUPPLIER : "é entregue por"
    
    PURCHASE-ORDER {
        long purchaseOrderId
        long totalValue
        datetime deliveryDate
    } 
    
    RESTAURANT {
        long restaurantId        
        string cnpj
        long authorizedBudget
    }

    USER }o--|| RESTAURANT : "possui"
    
    USER {
        long userId
        string name
        string login
        string password
        string role
    }

    SUPPLIER {
        long supplierId
        string cnpj
    }
```