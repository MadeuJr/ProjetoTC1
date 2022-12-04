function setFormAddSeguradora() {
    let xml =
        '<form onsubmit="if (ValidateEmail() == false) {return false} " class="pure-form border">' +
        '<fieldset>' +
        '<h3 class="is-center">Cadastro de nova Seguradora</h3>' +
        '<hr>' +
        '<div class="pure-g marginForm">' +

        '<div class="pure-u-2-5 l-box-form">' +
        '<label for="segCNPJ">CNPJ</label>' +
        '<input class="pure-input-rounded" name="placaL" type="text" placeholder="CNPJ" required />' +
        '</div>' +
        '<div class="pure-u-2-5 l-box-form">' +
        '<label for="segRazaoSoc">Razão Social</label>' +
        '<input class="pure-input-rounded" name="placaN" placeholder="Razão Social" type="text" required  />' +
        '</div>' +

        '<div class="pure-u-3-24 l-box-form">' +
        '<label for="segInitDate">Data de inicio</label>' +
        '<input class="pure-input-rounded" name="placaEstado" type="date" required />' +
        ' </div>' +

        ' <div class="pure-u-2-5 l-box-form">' +
        '<label for="segEmail">E-mail</label>' +
        '<input class="pure-input-rounded" name="segEmail" id="segEmail" type="text" placeholder="example@example.com" required />' +
        '<span class="result" id="result"></span>' +
        '</div>' +

        '<div class="pure-u-3-24 l-box-form">' +
        '<label for="segTel">Telefone</label>' +
        '<input class="pure-input-rounded" name="segTel" type="tel" inputmode="numeric" placeholder="1611223344" maxlength="11" minlength="10" pattern="\\d*" required/>' +
        '</div> ' +
        '<div class="pure-u-1 is-center">' +
        '<button class="button">Cadastrar</button>' +
        '</div>' +

        '</div>' +

        '</fieldset>' +
        '</form>';

    document.getElementById("forms").innerHTML = xml;
}

function setFormDeleteSeguradora() {
    xml =
        '<form class="pure-form border">' +
        "<fieldset>" +
        '<h3 class="is-center">Exclusão de Seguradora</h3>' +
        "<hr>" +
        '<div class="marginForm is-center">' +
        "<br>" +
        '<label for="idSeg">ID da Seguradora</label>' +
        '<select class="pure-input-rounded" name="combustivel" required>' +
        "<option selected disabled></option>" +
        '<option value="1">1</option>' +
        '<option value="2">2</option>' +
        '<option value="3">3</option>' +
        '<option value="4">4</option>' +
        "</select>" +
        "<br>" +
        "<br>" +
        '<label for="confirmationExclude">Confirma exclusão?</label>' +
        '<input name="confirmationExclude" type="checkbox" required>' +
        "<br>" +
        '<button type="submit" class="button button-error">Deletar</button>' +
        "</div>" +
        "</fieldset>" +
        "</form>" +
        "</fieldset>";

    document.getElementById("forms").innerHTML = xml;
}

function setFormUpdateSeguradora() {
    xml =
        '<form onsubmit="if (ValidateEmail() == false) {return false} " class="pure-form border">' +
        '<fieldset>' +
        ' <h3 class="is-center">Alteração de Seguradora</h3>' +
        ' <hr>' +
        ' <div class="marginForm is-center">' +
        ' <br>' +
        ' <label for="idVeículo">ID da Seguradora</label>' +
        ' <select class="pure-input-rounded" name="combustivel" required>' +
        ' <option selected disabled></option>' +
        ' <option value="1">1</option>' +
        ' <option value="2">2</option>' +
        ' <option value="3">3</option>' +
        ' <option value="4">4</option>' +
        ' </select>' +
        '<br>' +
        ' <br>' +
        '</div>' +
        '<div class="pure-g marginForm">' +

        '<div class="pure-u-2-5 l-box-form">' +
        '<label for="segCNPJ">CNPJ</label>' +
        '<input class="pure-input-rounded" name="placaL" type="text" placeholder="CNPJ" required />' +
        '</div>' +
        ' <div class="pure-u-2-5 l-box-form">' +
        ' <label for="segRazaoSoc">Razão Social</label>' +
        '<input class="pure-input-rounded" name="placaN" placeholder="Razão Social" type="text"required />' +
        '</div>' +

        ' <div class="pure-u-3-24 l-box-form">' +
        '<label for="segInitDate">Data de inicio</label>' +
        '<input class="pure-input-rounded" name="placaEstado" type="date" required />' +
        '</div>' +

        '<div class="pure-u-2-5 l-box-form">' +
        ' <label for="segEmail">E-mail</label>' +
        '<input class="pure-input-rounded" name="segEmail" id="segEmail" type="text"placeholder="example@example.com" required />' +
        '<span class="result" id="result"></span>' +
        '</div>' +

        ' <div class="pure-u-3-24 l-box-form">' +
        '<label for="segTel">Telefone</label>' +
        '<input class="pure-input-rounded" name="segTel" type="tel" inputmode="numeric" placeholder="1611223344" maxlength="11" minlength="10" pattern="\d*" required />' +
        '</div>' +
        '<div class="pure-u-1 is-center">' +
        '<button class="button">Cadastrar</button>' +
        '</div>' +

        '</div>' +

        '</fieldset>' +
        '</form>';
    document.getElementById("forms").innerHTML = xml;
}


function ValidateEmail() {
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    var input = document.getElementById("segEmail")
    if (input.value.match(mailformat)) {
        document.getElementById("result").innerHTML = ""

        return true;
    }
    else {

        document.getElementById("result").innerHTML = "E-mail inválido, insira um e-mail válido"
        return false;
    }
}

function submitVerify() {
    if (ValidateEmail() == true) {
        return true;
    }
    else {
        return false;
    }
}