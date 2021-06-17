package gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/lista-empresa")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		List<Empresa> listaEmpresas = Banco.getListaEmpresas();
		
		/*out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>Nome da Empresa</h1>");
		out.println("<ul>");
		for (Empresa empresa : ListaEmpresas) {
			out.println("<li><h2>".concat(empresa.getNome() ).concat("</h2></li>"));
		}
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");*/
		//Chamar o JSP
		request.setAttribute("empresas", listaEmpresas);
		RequestDispatcher rd = request.getRequestDispatcher("/lista-empresas.jsp");
		
		rd.forward(request, response);
		

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(	"O Servlt foi chamado: ".concat(String.valueOf(df.format(GregorianCalendar.getInstance().getTime()))));

	}

}
