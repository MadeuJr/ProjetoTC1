function setFormAddSeguradora() {
    let xml =
        '<form class="pure-form border">' +
        "<fieldset>" +
        '<h3 class="is-center">Cadastro de novo veículo</h3>' +
        "<hr>" +
        '<div class="pure-g marginForm">' +
        '<div class="pure-u-1-12 l-box-form">' +
        '<label for="placaL">Letras</label>' +
        '<input class="pure-input-rounded" name="placaL" type="text" placeholder="ABC" maxlength="3" minlength="3" pattern="[A-Z]*" required />' +
        "</div>" +
        '<div class="pure-u-2-24 l-box-form">' +
        '<label for= "placaN" > Numeros</label >' +
        '<input class="pure-input-rounded" name="placaN" type="text" inputmode="numeric" placeholder="1234" maxlength="4" minlength="4" pattern="d*" required />' +
        " </div >" +
        ' <div class="pure-u-3-24 l-box-form">' +
        '<label for="placaEstado">Estado</label>' +
        '<input class="pure-input-rounded" name="placaEstado" type="text" placeholder="Estado" minlength="2" maxlength="2" pattern="[A-Z]*" required />' +
        "</div>" +
        ' <div class="pure-u-3-24 l-box-form">' +
        '<label for="placaCidade">Cidade</label>' +
        '<input class="pure-input-rounded" name="placaCidade" type="text" placeholder="Cidade" required />' +
        "</div>" +
        '<div class="pure-u-3-24 l-box-form">' +
        "<br>" +
        '<label for="vTipo">Tipo:</label>' +
        '<select class="pure-input-rounded" name="tipo" required>' +
        " <option selected disabled></option>" +
        '<option value="Carro">Carro</option>' +
        '<option value="Moto">Moto</option>' +
        "</select>" +
        "</div>" +
        '<div class="pure-u-3-24 l-box-form">' +
        '<label for="vMarca">Marca do veículo</label>' +
        '<input class="pure-input-rounded" name="vMarca" type="text" placeholder="Insira uma Marca" required />' +
        "</div>" +
        ' <div class="pure-u-3-24 l-box-form">' +
        '<label for="vModelo">Modelo do veículo</label>' +
        '<input class="pure-input-rounded" name="vModelo" type="text" placeholder="Insira um modelo" required />' +
        "</div>" +
        "<div>" +
        ' <label for="vAno">Ano do veículo</label>' +
        '<input class="pure-input-rounded" name="vAno" type="text" inputmode="numeric" placeholder="1980-2023" maxlength="4" minlength="4" pattern="d*" required />' +
        "</div>" +
        '<div class="pure-u-3-6 l-box-form">' +
        "<br>" +
        '<label for="combustivel">Combutivel do veículo:</label>' +
        '<select class="pure-input-rounded" name="combustivel" required>' +
        "<option selected disabled></option>" +
        '<option value="Gasolina">Gasolina</option>' +
        '<option value="Alcool">Alcool</option>' +
        '<option value="Flex">Flex</option>' +
        '<option value="Diesel">Diesel</option>' +
        "</select>" +
        "</div>" +
        "</div >" +
        '<div class="container">' +
        '<ul class="boxs-container is-center">' +
        '<label for="acessorios">Acessorios</label>' +
        "<br>" +
        '<li><input type="checkbox" id="checkbox-1" value="molasEsportivas"><label for="checkbox-1">Molas esportivas</label></li>' +
        '<li><input type="checkbox" id="checkbox-2" value="farolLed"><label for="checkbox-2">Farol Led</label></li>' +
        '<li><input type="checkbox" id="checkbox-3" value="palhetas"><label for="checkbox-3">Palhetas</label></li>' +
        '<li><input type="checkbox" id="checkbox-4" value="GPS"><label for="checkbox-4">GPS</label></li>' +
        '<li><input type="checkbox" id="checkbox-5" value="centralMultimidia"><label for="checkbox-5">Central Multimídia</label></li>' +
        '<li><input type="checkbox" id="checkbox-6" value="Alarme"><label for="checkbox-6">Alarme</label></li>' +
        '<li><input type="checkbox" id="checkbox-7" value="airbag"><label for="checkbox-7">Airbag</label></li>' +
        '<li><input type="checkbox" id="checkbox-8" value="suporteCelular"><label for="checkbox-8">Suporte para Celular</label></li>' +
        "</ul>" +
        " </div>" +
        ' <div class="is-center">' +
        '<button type="submit" class="button">Cadastrar</button>' +
        " </div>" +
        "</fieldset>" +
        "</form>";

    document.getElementById("forms").innerHTML = xml;
}

function setFormDeleteSeguradora() {
    xml =
        '<form class="pure-form border">' +
        "<fieldset>" +
        '<h3 class="is-center">Exclusão de veículo</h3>' +
        "<hr>" +
        '<div class="marginForm is-center">' +
        "<br>" +
        '<label for="idVeículo">ID do veículo</label>' +
        '<select class="pure-input-rounded" name="combustivel" required>' +
        "<option selected disabled></option>" +
        '<option value="1">1</option>' +
        '<option value="2">2</option>' +
        '<option value="3">3</option>' +
        '<option value="4">4</option>' +
        "</select>" +
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
        '<form class="pure-form border">' +
        "<fieldset>" +
        '<h3 class="is-center">Alteração de veículo</h3>' +
        "<hr>" +
        '<div class="marginForm is-center">' +
        "<br>" +
        '<label for="idVeículo">ID do veículo</label>' +
        '<select class="pure-input-rounded" name="combustivel" required>' +
        "<option selected disabled></option>" +
        '<option value="1">1</option>' +
        '<option value="2">2</option>' +
        '<option value="3">3</option>' +
        '<option value="4">4</option>' +
        "</select>" +
        "<br>" +
        "</div>" +
        '<div class="pure-g marginForm">' +
        '<div class="pure-u-1-12 l-box-form">' +
        '<label for="placaL">Letras</label>' +
        '<input class="pure-input-rounded" name="placaL" type="text" placeholder="ABC" maxlength="3" minlength="3" pattern="[A-Z]*" required />' +
        "</div>" +
        '<div class="pure-u-2-24 l-box-form">' +
        '<label for= "placaN" > Numeros</label >' +
        '<input class="pure-input-rounded" name="placaN" type="text" inputmode="numeric" placeholder="1234" maxlength="4" minlength="4" pattern="d*" required />' +
        " </div >" +
        ' <div class="pure-u-3-24 l-box-form">' +
        '<label for="placaEstado">Estado</label>' +
        '<input class="pure-input-rounded" name="placaEstado" type="text" placeholder="Estado" minlength="2" maxlength="2" pattern="[A-Z]*" required />' +
        "</div>" +
        ' <div class="pure-u-3-24 l-box-form">' +
        '<label for="placaCidade">Cidade</label>' +
        '<input class="pure-input-rounded" name="placaCidade" type="text" placeholder="Cidade" required />' +
        "</div>" +
        '<div class="pure-u-3-24 l-box-form">' +
        "<br>" +
        '<label for="vTipo">Tipo:</label>' +
        '<select class="pure-input-rounded" name="tipo" required>' +
        " <option selected disabled></option>" +
        '<option value="Carro">Carro</option>' +
        '<option value="Moto">Moto</option>' +
        "</select>" +
        "</div>" +
        '<div class="pure-u-3-24 l-box-form">' +
        '<label for="vMarca">Marca do veículo</label>' +
        '<input class="pure-input-rounded" name="vMarca" type="text" placeholder="Insira uma Marca" required />' +
        "</div>" +
        ' <div class="pure-u-3-24 l-box-form">' +
        '<label for="vModelo">Modelo do veículo</label>' +
        '<input class="pure-input-rounded" name="vModelo" type="text" placeholder="Insira um modelo" required />' +
        "</div>" +
        "<div>" +
        ' <label for="vAno">Ano do veículo</label>' +
        '<input class="pure-input-rounded" name="vAno" type="text" inputmode="numeric" placeholder="1980-2023" maxlength="4" minlength="4" pattern="d*" required />' +
        "</div>" +
        '<div class="pure-u-3-6 l-box-form">' +
        "<br>" +
        '<label for="combustivel">Combutivel do veículo:</label>' +
        '<select class="pure-input-rounded" name="combustivel" required>' +
        "<option selected disabled></option>" +
        '<option value="Gasolina">Gasolina</option>' +
        '<option value="Alcool">Alcool</option>' +
        '<option value="Flex">Flex</option>' +
        '<option value="Diesel">Diesel</option>' +
        "</select>" +
        "</div>" +
        "</div >" +
        '<div class="container">' +
        '<ul class="boxs-container is-center">' +
        '<label for="acessorios">Acessorios</label>' +
        "<br>" +
        '<li><input type="checkbox" id="checkbox-1" value="molasEsportivas"><label for="checkbox-1">Molas esportivas</label></li>' +
        '<li><input type="checkbox" id="checkbox-2" value="farolLed"><label for="checkbox-2">Farol Led</label></li>' +
        '<li><input type="checkbox" id="checkbox-3" value="palhetas"><label for="checkbox-3">Palhetas</label></li>' +
        '<li><input type="checkbox" id="checkbox-4" value="GPS"><label for="checkbox-4">GPS</label></li>' +
        '<li><input type="checkbox" id="checkbox-5" value="centralMultimidia"><label for="checkbox-5">Central Multimídia</label></li>' +
        '<li><input type="checkbox" id="checkbox-6" value="Alarme"><label for="checkbox-6">Alarme</label></li>' +
        '<li><input type="checkbox" id="checkbox-7" value="airbag"><label for="checkbox-7">Airbag</label></li>' +
        '<li><input type="checkbox" id="checkbox-8" value="suporteCelular"><label for="checkbox-8">Suporte para Celular</label></li>' +
        "</ul>" +
        " </div>" +
        ' <div class="is-center">' +
        '<button type="submit" class="button">Cadastrar</button>' +
        " </div>" +
        "</fieldset>" +
        "</form>" +
        "</fieldset>" +
        "</form>";
    document.getElementById("forms").innerHTML = xml;
}


