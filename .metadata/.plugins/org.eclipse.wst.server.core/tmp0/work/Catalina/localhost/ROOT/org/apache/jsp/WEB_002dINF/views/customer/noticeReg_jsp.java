/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.89
 * Generated at: 2023-07-05 02:55:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class noticeReg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-5.0.7.RELEASE.jar", Long.valueOf(1687152304634L));
    _jspx_dependants.put("jar:file:/D:/Class/WorkSpace/SpringClass/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/SL11_SECURITY3_USERDETAILSSERVICE/WEB-INF/lib/spring-security-taglibs-5.0.7.RELEASE.jar!/META-INF/security.tld", Long.valueOf(1532606274000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody;

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
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.release();
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

      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<div id=\"content\">\n");
      out.write("	<h2>공지사항</h2>\n");
      out.write("	<h3 class=\"hidden\">방문페이지위치</h3>\n");
      out.write("	<ul id=\"breadscrumb\" class=\"block_hlist\">\n");
      out.write("		<li>HOME</li>\n");
      out.write("		<li>\n");
      out.write("			고객센터\n");
      out.write("		</li>\n");
      out.write("		<li>\n");
      out.write("			공지사항등록\n");
      out.write("		</li>\n");
      out.write("	</ul>\n");
      out.write("	<form action=\"/customer/noticeReg.htm?");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.parameterName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('=');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${_csrf.token}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("		<div id=\"notice-article-detail\" class=\"article-detail margin-large\" >						\n");
      out.write("			<dl class=\"article-detail-row\">\n");
      out.write("				<dt class=\"article-detail-title\">\n");
      out.write("					제목\n");
      out.write("				</dt>\n");
      out.write("				<dd class=\"article-detail-data\">\n");
      out.write("					&nbsp;<input name=\"title\"/>\n");
      out.write("				</dd>\n");
      out.write("			</dl>				\n");
      out.write("									\n");
      out.write("			<dl class=\"article-detail-row\">\n");
      out.write("				<dt class=\"article-detail-title\">\n");
      out.write("					첨부파일\n");
      out.write("				</dt>\n");
      out.write("				<dd class=\"article-detail-data\">\n");
      out.write("					&nbsp;<input type=\"file\" id=\"txtFile\" name=\"file\" />\n");
      out.write("					<!-- &nbsp;<input type=\"file\" id=\"txtFile\" name=\"file\" multiple=\"multiple\" /> -->\n");
      out.write("				</dd>\n");
      out.write("			</dl>\n");
      out.write("\n");
      out.write("			<div class=\"article-content\" >\n");
      out.write("				<textarea id=\"txtContent\" class=\"txtContent\" name=\"content\"></textarea>\n");
      out.write("			</div>\n");
      out.write("			\n");
      out.write("		</div>\n");
      out.write("		<p class=\"article-comment margin-small\">						\n");
      out.write("			<input class=\"btn-save button\" type=\"submit\" value=\"저장\" />\n");
      out.write("			<a class=\"btn-cancel button\" href=\"notice.htm\">취소</a>						\n");
      out.write("		</p>\n");
      out.write("		<!-- post 방식 요청에는 항상 필요 : 요청 위조 방지 -->\n");
      out.write("		");
      out.write("\n");
      out.write("	</form>		\n");
      out.write("	\n");
      out.write("	<div>\n");
      out.write("     <ol>\n");
      out.write("       <li>principal : ");
      if (_jspx_meth_sec_005fauthentication_005f0(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("       <!-- CustomUser의 member 필드 -->\n");
      out.write("       <li>MemberVO : ");
      if (_jspx_meth_sec_005fauthentication_005f1(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("       <li>사용자 ID : ");
      if (_jspx_meth_sec_005fauthentication_005f2(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("       <li>사용자 이름 : ");
      if (_jspx_meth_sec_005fauthentication_005f3(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("       <li>사용자 권한 목록 : ");
      if (_jspx_meth_sec_005fauthentication_005f4(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("     </ol>\n");
      out.write("   </div>	\n");
      out.write("	\n");
      out.write("						\n");
      out.write("</div>				\n");
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

  private boolean _jspx_meth_sec_005fauthentication_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f0_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f0.setParent(null);
      // /WEB-INF/views/customer/noticeReg.jsp(53,23) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f0.setProperty("principal");
      int _jspx_eval_sec_005fauthentication_005f0 = _jspx_th_sec_005fauthentication_005f0.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f0);
      _jspx_th_sec_005fauthentication_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f0, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f1 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f1_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f1.setParent(null);
      // /WEB-INF/views/customer/noticeReg.jsp(55,22) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f1.setProperty("principal.member");
      int _jspx_eval_sec_005fauthentication_005f1 = _jspx_th_sec_005fauthentication_005f1.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f1);
      _jspx_th_sec_005fauthentication_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f1, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f2 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f2_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f2.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f2.setParent(null);
      // /WEB-INF/views/customer/noticeReg.jsp(56,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f2.setProperty("principal.member.id");
      int _jspx_eval_sec_005fauthentication_005f2 = _jspx_th_sec_005fauthentication_005f2.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f2);
      _jspx_th_sec_005fauthentication_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f2, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f3 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f3_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f3.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f3.setParent(null);
      // /WEB-INF/views/customer/noticeReg.jsp(57,20) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f3.setProperty("principal.member.name");
      int _jspx_eval_sec_005fauthentication_005f3 = _jspx_th_sec_005fauthentication_005f3.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f3);
      _jspx_th_sec_005fauthentication_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f3, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_sec_005fauthentication_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f4 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f4_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f4.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f4.setParent(null);
      // /WEB-INF/views/customer/noticeReg.jsp(58,23) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f4.setProperty("principal.member.authList");
      int _jspx_eval_sec_005fauthentication_005f4 = _jspx_th_sec_005fauthentication_005f4.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f4);
      _jspx_th_sec_005fauthentication_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f4, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f4_reused);
    }
    return false;
  }
}
