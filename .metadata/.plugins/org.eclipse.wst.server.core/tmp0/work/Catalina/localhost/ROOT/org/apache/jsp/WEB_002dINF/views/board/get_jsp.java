/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.89
 * Generated at: 2023-06-26 03:25:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class get_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-5.0.7.RELEASE.jar", Long.valueOf(1687152304634L));
    _jspx_dependants.put("jar:file:/D:/Class/WorkSpace/SpringClass/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SL02_BOARD3_SEARCH/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/Class/WorkSpace/SpringClass/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SL02_BOARD3_SEARCH/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1687143252236L));
    _jspx_dependants.put("jar:file:/D:/Class/WorkSpace/SpringClass/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SL02_BOARD3_SEARCH/WEB-INF/lib/spring-security-taglibs-5.0.7.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1532606274000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"../images/SiSt.ico\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js\"></script> \r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/cdn-main/example.css\">\r\n");
      out.write("<script src=\"/resources/cdn-main/example.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(" span.material-symbols-outlined{\r\n");
      out.write("    vertical-align: text-bottom;\r\n");
      out.write(" }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("  <h1>Sping Board</h1>\r\n");
      out.write("  <ul>\r\n");
      out.write("    ");
      if (_jspx_meth_sec_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_sec_005fauthorize_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <li><a href=\"#\">회원가입</a></li>\r\n");
      out.write("  </ul>\r\n");
      out.write("</header>\r\n");
      out.write("<div>\r\n");
      out.write("  <!-- Alt + Shift + Y 자동줄바꿈 -->\r\n");
      out.write("  <h3><span class=\"material-symbols-outlined\" style=\"vertical-align: sub\">stylus_note</span>Read Page</h3>\r\n");
      out.write("  <div>\r\n");
      out.write("  <form action=\"/board/register\" method=\"post\"> \r\n");
      out.write("	  <table>  \r\n");
      out.write("	    <tbody>\r\n");
      out.write("	      <tr>\r\n");
      out.write("	        <th>글번호</th>\r\n");
      out.write("	        <td><input type=\"text\" name=\"bno\" class=\"full\"  readonly=\"readonly\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ board.bno }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>        \r\n");
      out.write("	      </tr> \r\n");
      out.write("	      <tr>\r\n");
      out.write("	        <th>제목</th>\r\n");
      out.write("	        <td><input type=\"text\" name=\"title\" class=\"full\"  readonly=\"readonly\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ board.title }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>        \r\n");
      out.write("	      </tr> \r\n");
      out.write("	      <tr>\r\n");
      out.write("	        <th>내용</th>\r\n");
      out.write("	        <td><textarea  name=\"content\" class=\"full\" readonly=\"readonly\">");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</textarea></td>        \r\n");
      out.write("	      </tr> \r\n");
      out.write("	      <tr>\r\n");
      out.write("	        <th>작성자</th>\r\n");
      out.write("	        <td><input type=\"text\" name=\"writer\" class=\"short\" readonly=\"readonly\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ board.writer }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>        \r\n");
      out.write("	      </tr>  \r\n");
      out.write("	    </tbody> \r\n");
      out.write("	    <tfoot>\r\n");
      out.write("	      <tr>\r\n");
      out.write("	        <td colspan=\"2\">\r\n");
      out.write("	          <button type=\"button\"  data-oper=\"modify\" class=\"edit\">Modify</button>\r\n");
      out.write("	          <button type=\"button\"  data-oper=\"remove\" class=\"delete\">Delete</button>\r\n");
      out.write("	          <button type=\"button\" data-oper=\"list\"  class=\"list\"> List</button>\r\n");
      out.write("	        </td>\r\n");
      out.write("	      </tr>\r\n");
      out.write("	    </tfoot>\r\n");
      out.write("	  </table>\r\n");
      out.write("	  \r\n");
      out.write("	  <input type=\"hidden\" name=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ _csrf.parameterName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ _csrf.token }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("	  \r\n");
      out.write("	  <input type=\"hidden\" name=\"pageNum\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ criteria.pageNum }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("	  <input type=\"hidden\" name=\"amount\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ criteria.amount }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("	  \r\n");
      out.write("	  	<!-- 검색 -> 검색어 & 검색조건 넘겨줌 -->\r\n");
      out.write("      <input type=\"hidden\" name=\"type\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageMaker.criteria.type }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("      <input type=\"hidden\" name=\"keyword\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageMaker.criteria.keyword }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("</form> \r\n");
      out.write("       \r\n");
      out.write("  </div>   \r\n");
      out.write("  <div class=\"message full\" title=\"삭제구현\" >\r\n");
      out.write("    <ol>\r\n");
      out.write("      <li>삭제 버튼 클릭시 확인</li>\r\n");
      out.write("      <li>삭제 후 목록으로 이동</li>\r\n");
      out.write("    </ol>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("  $(function (){\r\n");
      out.write("	  \r\n");
      out.write("	  var formObj = $(\"form\");\r\n");
      out.write("	  \r\n");
      out.write("	  $(\"tfoot button\").on(\"click\", function (event){		  \r\n");
      out.write("		  var operation = $(this).data(\"oper\");\r\n");
      out.write("		  if(operation === 'modify'){\r\n");
      out.write("			  //location.href = \"/board/modify?bno=\"+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ board.bno }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("			  formObj.attr({\r\n");
      out.write("				  \"action\":\"/board/modify\",\r\n");
      out.write("				  \"method\":\"get\"\r\n");
      out.write("			  });\r\n");
      out.write("	         formObj.submit();\r\n");
      out.write("		  }else if(operation === 'remove'){\r\n");
      out.write("			  if( confirm(\"정말 삭제할거냐? \") ){\r\n");
      out.write("				  //location.href = \"/board/remove?bno=\"+");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ board.bno }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(";\r\n");
      out.write("				  formObj.attr({\r\n");
      out.write("							  \"action\":\"/board/remove\",\r\n");
      out.write("							  \"method\":\"get\"\r\n");
      out.write("						  });\r\n");
      out.write("				  formObj.submit();\r\n");
      out.write("			  } // \r\n");
      out.write("		  }else if( operation === 'list' ){\r\n");
      out.write("			  \r\n");
      out.write("			  var pageNumTag = $(\"input[name=pageNum]\").clone();\r\n");
      out.write("			  var amountTag = $(\"input[name=amount]\").clone();\r\n");
      out.write("			  var type = $(\"input[name=type]\").clone();\r\n");
      out.write("			  var keyword = $(\"input[name=keyword]\").clone();\r\n");
      out.write("			  \r\n");
      out.write("			  formObj\r\n");
      out.write("			     .attr({\r\n");
      out.write("		               \"action\":\"/board/list\",\r\n");
      out.write("		               \"method\":\"get\"\r\n");
      out.write("		            })\r\n");
      out.write("	            .empty()\r\n");
      out.write("	            .append( pageNumTag )\r\n");
      out.write("	            .append( amountTag )\r\n");
      out.write("	            .append( type )\r\n");
      out.write("	            .append( keyword )\r\n");
      out.write("	            .submit();\r\n");
      out.write("		  } // if\r\n");
      out.write("	  }); // click\r\n");
      out.write("  }); // ready\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sec_005fauthorize_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_sec_005fauthorize_005f0_reused = false;
    try {
      _jspx_th_sec_005fauthorize_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f0.setParent(null);
      // /WEB-INF/views/board/get.jsp(25,4) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f0.setAccess("isAnonymous()");
      int _jspx_eval_sec_005fauthorize_005f0 = _jspx_th_sec_005fauthorize_005f0.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("    	<li><a href=\"#\">로그인</a></li>\r\n");
        out.write("    ");
      }
      if (_jspx_th_sec_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f0);
      _jspx_th_sec_005fauthorize_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthorize_005f0, _jsp_getInstanceManager(), _jspx_th_sec_005fauthorize_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    boolean _jspx_th_sec_005fauthorize_005f1_reused = false;
    try {
      _jspx_th_sec_005fauthorize_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthorize_005f1.setParent(null);
      // /WEB-INF/views/board/get.jsp(28,4) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthorize_005f1.setAccess("isAuthenticated()");
      int _jspx_eval_sec_005fauthorize_005f1 = _jspx_th_sec_005fauthorize_005f1.doStartTag();
      if (_jspx_eval_sec_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("    	<li><a href=\"#\">로그아웃</a></li>\r\n");
        out.write("    ");
      }
      if (_jspx_th_sec_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005faccess.reuse(_jspx_th_sec_005fauthorize_005f1);
      _jspx_th_sec_005fauthorize_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthorize_005f1, _jsp_getInstanceManager(), _jspx_th_sec_005fauthorize_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /WEB-INF/views/board/get.jsp(51,72) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ board.content }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }
}
