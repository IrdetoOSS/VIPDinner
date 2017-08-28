# VIPDinner
This microservice is used to offer an online course menu during IBC's VIP dinner.

The service uses an in-memoru database. So, keep the initial menu course safe in case you need to restart the Docker Container.

## Running the VIPDinner Microservice

* ```docker pull irdetooss/vipdinner```
* ```docker run -d -p 80:80 irdetooss/vipdinner```

## Endpoints

* GET http://[public_ip_or_domain]/vipdinner
  - Lists all items already created
* POST http://[public_ip_or_domain]/vipdinner/create
  - Create a new Item

## Item body

To create a new Item, a JSON body must be informed in the POST method, as in the example below:

```
{
	"price" : 2.3,
	"dish" : "Zalm",
	"descriptions" : [
		{
			"language" : "English",
			"text" : "blah blah"
		},
		{
			"language" : "Spanish",
			"text" : "bleh bleh"
		}
	]
}
```

## Bulk Create Body

In case the user wants to create several items in one go, the body will need to be a list of items, as in the example below:

```
[
	{
		"price" : 25,
		"dish" : "Zalm",
		"descriptions" : [
			{
				"language" : "English",
				"text" : "blah blah"
			},
			{
				"language" : "Spanish",
				"text" : "bleh bleh"
			}
		]
	},
	{
		"price" : 32,
		"dish" : "Picanha",
		"descriptions" : [
			{
				"language" : "English",
				"text" : "blah blah"
			},
			{
				"language" : "Spanish",
				"text" : "bleh bleh"
			}
		]
	}
]
```