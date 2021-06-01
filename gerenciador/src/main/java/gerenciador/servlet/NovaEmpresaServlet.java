package gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nova-empresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String nomeEmpresa = request.getParameter("nome");
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		out.println("<h1>Empresa ".concat(nomeEmpresa).concat(" cadastrada com sucesso!!!</h1>"));
		out.println("</body>");
		out.println("</html>");
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(	"O Servlt foi chamado: ".concat(String.valueOf(df.format(GregorianCalendar.getInstance().getTime()))));

	}

}
