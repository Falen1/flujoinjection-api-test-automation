function fn(){
    karate.configure('connectTimeout', 60000);
    karate.configure('readTimeout',60000);
    karate.configure('logPrettyResponse', true);

    var config = {

    baseUrlShopping : 'https://zhvjbyky9l.execute-api.us-east-1.amazonaws.com/qa/api/shopping-cart',
    baseUrlGetTrx : 'https://zhvjbyky9l.execute-api.us-east-1.amazonaws.com/qa/api/get-trx',
    baseUrlInjection : 'https://zhvjbyky9l.execute-api.us-east-1.amazonaws.com/qa/api/injection',
    channel : 'RPOS',
    checkout : '501',
    location_id_long : '20030',
    location_id : '30',
    country : 'PE',
    
    
    petStoreUrl: 'https://petstore.swagger.io',
	paths:{
		user : '/v2/user'
	}
	
	
	
	
	
	
    }

    return config;
}