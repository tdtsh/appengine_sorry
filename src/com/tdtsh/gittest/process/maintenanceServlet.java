/**
 * 
 */
package com.tdtsh.gittest.process;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tadatoshi_hanazaki
 *
 */
@SuppressWarnings("serial")
public class maintenanceServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setStatus(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = resp.getWriter();

		writer.println("<!DOCUTYPE html>");
		writer.println("<html lang=\"ja\">");
		writer.println("<head>");
		writer.println("	<meta charset=\"UTF-8\">");
		writer.println("	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" />");
		writer.println("	<title> ただいまメンテナンス中です</title>");
		writer.println("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/import.css\">");
		writer.println("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/basic.css\">");
		writer.println("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/font_def.css\">");
		writer.println("	<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/notice.css\">");
		writer.println("</head>");
		writer.println("");
		writer.println("");
		writer.println("<body>");
		writer.println("");
		writer.println("<div id=\"pub_block\">");
		writer.println("	<a name=\"pagetop\"></a>");
		writer.println("");
		writer.println("<!-- ヘッダーここから -->");
		writer.println("<div id=\"logo_normal\">");
		writer.println("	<h1 ><a href=\"/\" title=\"トップページ\">Sorry！</a></h1>");
		writer.println("</div>");
		writer.println("<!-- ヘッダーここまで -->");
		writer.println("");
		writer.println("	<div id=\"contents\" class=\"clearfix\">");
		writer.println("		<div id=\"entry_block\">");
		writer.println("					<h2 class=\"ch01\">ただいまメンテナンス中です</h2>");
		writer.println("					<div class=\"ferror\">");
		writer.println("					");
		writer.println("");
		writer.println("						<div class=\"fsxl mam\">");
		writer.println("");
		writer.println("");
		writer.println("						<p>ただいまメンテナンス作業中です。<br />201X年X月X日 XX:00にオープンする予定です。<br />今しばらくお待ち下さい。</p>");
		writer.println("");
		writer.println("");
		writer.println("						</div><!--end of fsxl-->");
		writer.println("					</div><!--end of ferror-->");
		writer.println("");
		writer.println("");
		writer.println("				<div class=\"btm16\"><input type=\"submit\" name=\"back\" value=\"←前のページに戻る\"/></div>");
		writer.println("");
		writer.println("			</div><!--end of entry_block-->");
		writer.println("		</div><!--end of contents-->");
		writer.println("");
		writer.println("</div><!-- //pub_block-->");
		writer.println("");
		writer.println("</body>");
		writer.println("</html>");
        
    }


}
