
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid mx-4">

    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>"><img alt="home" src="<%=request.getContextPath()%>/resources/icons/home.svg"></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/appointment/"><img alt="Reserva" src="<%=request.getContextPath()%>/resources/icons/edit_calendar.svg"></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/appointment/"><img alt="usuario" src="<%=request.getContextPath()%>/resources/icons/manage_accounts.svg"></a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/appointment/"><img alt="admin-panel" src="<%=request.getContextPath()%>/resources/icons/admin_panel.svg"></a>
        </li>
<!--         <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Action</a></li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </ul>
        </li> -->
<!--         <li class="nav-item">
          <a class="nav-link disabled" aria-disabled="true">Disabled</a>
        </li> -->
      </ul>
      <div class="d-flex" role="search">
        <a class="nav-link active" aria-current="page" href="#"><img alt="home" src="<%=request.getContextPath()%>/resources/icons/logout.svg"></a>
      </div>
    </div>
  </div>
</nav>