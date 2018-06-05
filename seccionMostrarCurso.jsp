<%@page import="modelo.GestionBD"%>
<%
GestionBD c = new GestionBD();
%>
<section align="center">
		<section id="tabla" >
                    <h3>Profesores</h3><br>
                    <%out.print("<h3>"+c.recuperarCurso()+"</h3>");%>
                    <table class="table table-striped table-dark">
                    <thead>
                        <tr>
                          <th scope="col">Codigo</th>
                          <th scope="col">Curso</th>
                          <th scope="col">Nivel</th>
                          <th scope="col">Letra</th>
                          <th scope="col">Jornada</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                       
                            for(int i=0;i<c.a.size();i++) {
                                out.print("<tr>");
                                out.print("<th scope='row'>"+c.a.get(i)+"</th>");
                                out.print("<th>"+c.b.get(i)+"</th>");
                                out.print("<th>"+c.c.get(i)+"</th>");
                                out.print("<th>"+c.d.get(i)+"</th>");
                                out.print("<th>"+c.e.get(i)+"</th>");
                                out.print("</tr>");
                            }
                        
                        %>
                      </tbody>
                    </table>
		</section>
	</section>