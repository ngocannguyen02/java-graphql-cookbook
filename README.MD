# Cookbook

Cookbook is a Java GraphQL API basic.

## Installation

```bash
mvn clean install
mvn spring-boot:run
```

## Usage

http://localhost:8080/graphiq


### CREATE 
```graphql
mutation createRecipe($req: RecipeInput) {
        createRecipe(input: $req) {
          title
          description
          ingredients {
            name
            quantity
          }
      }
}
```

As query variables
```graphql
{
    "req" : {
           "title": "Steak frites",
           "description": "French dish with steak  and french fries",
           "ingredients": [{
                "name": "French fries",
                "quantity": "150g"
           },
           {
                "name": "Steak",
                "quantity": "1kg"
           }]
    }
}
```
### RETRIEVE
```graphql
query{
          recipe(title:"Steak frites")  {
          title
          description
          ingredients {
            name
            quantity
          }
      }
}
```

You can also use POSTMAN to play with your GraphQL endpoint (localhost:8080/graphql) 

Don't forget all requests are submitted as a POST operation, you can use graphQL option in body request. 

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
None