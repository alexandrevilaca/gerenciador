package gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>Oi Mundo - Via Servlet!!!</h1>");
		out.println("</body>");
		out.println("</html>");
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		System.out.println("O Servlt foi chamado: ".concat( String.valueOf( df.format( GregorianCalendar.getInstance().getTime() ) ) ) );
	}
}
