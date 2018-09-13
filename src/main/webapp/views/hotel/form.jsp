<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<jsp:include page="../header.jsp"/>

<%--<div id="page-wrapper">--%>
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Hotel</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>
<!-- /.row -->
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Create a new Hotel details
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-lg-6">

                        <form:form role="form" action="/hotel/add" modelAttribute="hotel" method="POST">
                            <form:hidden path="id"/>

                            <div class="form-group">
                                Hotel Name
                                <form:input path="name" cssErrorClass="error"/>
                                <form:errors path="name" cssClass="error"/><br>
                            </div>
                            <div class="form-group">
                                Email
                                <form:input path="email" cssErrorClass="error"/>
                                <form:errors path="email" cssClass="error"/><br>
                            </div>


                            <input type="submit" value="Submit" class="btn btn-default">
                        </form:form>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<%--<div class="row">--%>

<%--</div>--%>
<%--</div>--%>

<jsp:include page="../footer.jsp"/>
