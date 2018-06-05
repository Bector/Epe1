<%@page import="modelo.GestionBD"%>
<%
GestionBD c = new GestionBD();
%>
<section align="center">
		<section id="tabla" >
                    <h3>Asignatura</h3><br>
                    <%out.print("<h3>"+c.recuperarAsignatura()+"</h3>");%>
                    <table class="table table-striped table-dark">
                    <thead>
                        <tr>
                          <th scope="col">Codigo</th>
                          <th scope="col">Nombre</th>
                          <th scope="col">Rut Profesor</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                       
                            for(int i=0;i<c.a.size();i++) {
                                out.print("<tr>");
                                out.print("<th scope='row'>"+c.a.get(i)+"</th>");
                                out.print("<th>"+c.b.get(i)+"</th>");
                                out.print("<th>"+c.c.get(i)+"</th>");
                                out.print("</tr>");
                            }
                        
                        %>
                      </tbody>
                    </table>
		</section>
	</section>