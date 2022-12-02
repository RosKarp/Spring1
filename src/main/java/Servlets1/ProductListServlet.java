/*package Servlets1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductListServlet", urlPatterns = "/list")
public class ProductListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Product[] products = new Product[10];

        products[0] = new Product(1,"Bread", 10);
        products[1] = new Product(2,"Milk", 40);
        products[2] = new Product(3,"Cheese", 110);
        products[3] = new Product(4,"Banana", 20);
        products[4] = new Product(5,"Pear", 60);
        products[5] = new Product(6,"Cherry", 150);
        products[6] = new Product(7,"Chocolate", 100);
        products[7] = new Product(8,"Watermelon", 15);
        products[8] = new Product(9,"Apple", 30);
        products[9] = new Product(10,"Water", 10);

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");

        for(int i=0; i < 10; i++){
            resp.getWriter().println("id = " + products[i].getId() + ",   " + products[i].getTitle() + "   cost = " + products[i].getCost() + "<br><br>");
        }

        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }
}
*/