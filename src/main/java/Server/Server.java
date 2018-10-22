package Server;


import spark.Spark;

public class Server {
	public static void main(String[] args) {
		Bootstrap.init();
		Spark.port(9000);
		Router.configure();
		
		//Spark.get("/hello", (req, res) -> "Hello World");
		
		Spark.get("/say/*/to/*", (request, response) -> {
		    return "Number of splat parameters: " + request.splat().length;
		});
	}
}
