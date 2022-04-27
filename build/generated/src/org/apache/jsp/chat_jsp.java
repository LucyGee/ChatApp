package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"chat-app\" class=\"chat-app\">\n");
      out.write("    <button id=\"button-open-chat\" onclick=\"openChatMenu()\" aria-label=\"Start chat\">\n");
      out.write("        <b>We are online, Talk to Us </b> <img src=\"./img/user_headset.svg\" alt=\"BOT\" />\n");
      out.write("    </button>\n");
      out.write("    \n");
      out.write("    <div id=\"chat-menu\" class=\"chat_menu\">\n");
      out.write("        <div class=\"suggestion-btn\">\n");
      out.write("            <span class=\"suggestion-text chat-menu-text\">Leave a suggestion</span>\n");
      out.write("            <button id=\"open-suggestion\" class=\" chat_menu_icons \" onclick=\"openSuggestion()\" onmouseover=\"renderTxt()\" onmouseout=\"dismissTxt()\" aria-label=\"Leave a suggestion\" >\n");
      out.write("                <i class=\" fa-icon-menu fa fa-inbox \"></i>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"openchat-btn\">\n");
      out.write("            <span class=\"chat-text chat-menu-text\">MSpace Gumzo Chat</span>\n");
      out.write("            <button id=\"open-chat\" class=\"chat_menu_icons\" onclick=\"openChat()\" onmouseover=\"renderOpenChatTxt()\" onmouseout=\"dismissOpenChatTxt()\" aria-label=\"Start chat\">\n");
      out.write("                <i class=\" fa-icon-menu fa fa-comments \"></i>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"chat-parent\">\n");
      out.write("        <div class=\"chat-title\">\n");
      out.write("            <img src=\"./img/user_headset.svg\" alt=\"BOT\" />\n");
      out.write("            <div class=\"chat-actions\">\n");
      out.write("                <span id=\"chat_box_title\">\n");
      out.write("                    <b id=\"agentName\">Support</b><br>\n");
      out.write("                    <small>offline - leave a message</small>\n");
      out.write("                </span>\n");
      out.write("            <div >\n");
      out.write("                <button id=\"rate_btn\" class=\"action_buttons\" onclick=\"rateUs()\" title=\"Rate our service\" aria-label=\"Rate Us\"><i class=\"fa fa-thumbs-up\"></i></button>\n");
      out.write("                <button id=\"download_chat\" class=\"action_buttons\" title=\"Download conversation history\" onclick=\"downloadChat()\" aria-label=\"Download Chat\"> <i class=\" fa fa-download\"></i></button>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"log\" class=\"expanded\"></div>\n");
      out.write("        <div id=\"rate_us\"  style = \"display: none\">\n");
      out.write("            <div class=\"rate-us-title\">\n");
      out.write("                <p class=\"rate-msg\">Please rate our servcie.</p>\n");
      out.write("                <button onClick=\"closeRateUs()\" class=\"close-btn\"><i class=\"fa fa-close\"></i></button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rate-us\">\n");
      out.write("                <button id=\"like-btn\" onClick=\"liked()\" title=\"Satisfied\" class=\"rate-btn\"><i class=\"fa fa-thumbs-up\"></i></button>\n");
      out.write("                <button id=\"dislike-btn\" onClick=\"disliked()\" title=\"Disatisfied\" class=\"rate-btn\"><i class=\"fa fa-thumbs-down\"></i></button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"smsctrl\">\n");
      out.write("            <textarea spellcheck=\"true\" placeholder=\"Type a message...\" id=\"msg_txt\" class=\"txt\"\n");
      out.write("                      aria-label=\"Chat message\"></textarea>\n");
      out.write("            <button id=\"chatBtnSend\" class=\"sendbtn\"><i class=\"fa fa-paperclip\"></i></button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"chat-signup-parent\">\n");
      out.write("        <div class=\"title\">\n");
      out.write("            <b>Gumzo</b>\n");
      out.write("        </div>\n");
      out.write("        <form class=\"content\" id=\"chat-signup-form\">\n");
      out.write("            <div class=\"intro-message\">\n");
      out.write("                <p>To continue with the chat, kindly introduce yourself by providing the details below:</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group my-2\">\n");
      out.write("                <input type=\"text\" id=\"chat-name\" class=\"form-control\" placeholder=\"Your name\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group my-2\">\n");
      out.write("                <input type=\"email\" id=\"chat-email\" class=\"form-control\" placeholder=\"Your email\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group my-2\">\n");
      out.write("                <input type=\"text\" id=\"chat-phone\" class=\"form-control\" placeholder=\"Your mobile number\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group mt-5\">\n");
      out.write("               <button type=\"submit\">Send a message</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"modal\" id=\"fileModal\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">      \n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\">Send attached file</h5>\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                        <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>  \n");
      out.write("                <div class=\"modal-body\">  \n");
      out.write("                    <b><i class=\"fa fa-paperclip\"></i> <span id=\"modalFileName\"></span></b> \n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-footer\">   \n");
      out.write("                    <button class=\"btn btn-primary btn-sm rounded-pill\" id=\"btnSendFile\">Send</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"suggestion-parent\">\n");
      out.write("        <div class=\"suggestion-title\">\n");
      out.write("            <div class=\"chat-actions\">\n");
      out.write("                <span id=\"suggestion_box_title\">\n");
      out.write("                    <b class =\"title\">Suggestion Box</b> <br />\n");
      out.write("                    <small>We appreciate any suggestion from you. All suggestions are anonymous</small>\n");
      out.write("                </span>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("        <div class=\"suggestionctrl\">\n");
      out.write("            <textarea spellcheck=\"true\" placeholder=\"Type a suggestion...\" id=\"suggestion_txt\" class=\"suggest-txt\"\n");
      out.write("                      aria-label=\"Chat message\"></textarea>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"send-suggestion \">\n");
      out.write("            <b class=\"errorMSG\" id=\"blankMSG\"></b>\n");
      out.write("            <button id=\"suggestionBtnSend\" onclick=\"sendSuggestion()\" class=\"suggestionbtn\">\n");
      out.write("                <p>Send</p>\n");
      out.write("                <i class=\"send-fa fa fa-envelope-o\"></i>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"priority-parent\">\n");
      out.write("        <div class=\"p-close-btn\">\n");
      out.write("            <button id=\"p-close\" onclick=\"closePriorityRating()\" class=\"close-priority\">\n");
      out.write("                <i class=\"fa fa-close\"></i>\n");
      out.write("            </button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"priority-title\">\n");
      out.write("        \n");
      out.write("            <h1 class=\"priority-title-text\">Thank you.</h1>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("        <div class=\"priority-actions\">\n");
      out.write("\n");
      out.write("            <div class=\"also-text\">\n");
      out.write("                <b>You may also like to rate the priority of your suggestion:</b>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"priority-buttons\">\n");
      out.write("\n");
      out.write("                <div class=\"priority low\">\n");
      out.write("                    <button id=\"low-priority\" onclick=\"sendPriorityRating(2)\" class=\"prioritybtn\"></button>\n");
      out.write("                    <p>Low</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"priority\">\n");
      out.write("                    <button id=\"normal-priority\" onclick=\"sendPriorityRating(1)\" class=\"prioritybtn\"></button>\n");
      out.write("                    <p>Normal</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"priority\">\n");
      out.write("                    <button id=\"important-priority\" onclick=\"sendPriorityRating(3)\" class=\"prioritybtn\"></button>\n");
      out.write("                    <p>Important</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"priority\">\n");
      out.write("                    <button id=\"critical-priority\" onclick=\"sendPriorityRating(4)\" class=\"prioritybtn\"></button>\n");
      out.write("                    <p>Critical</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class =\"rating-sucess\">\n");
      out.write("                <b>Suggestion priority rated sucessfully!</b>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
