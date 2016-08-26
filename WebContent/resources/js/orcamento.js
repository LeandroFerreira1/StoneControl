function calculoCompLiq() {

	a = document.getElementById("form:compBruto_input").value.replace(",", ".");

	document.getElementById("form:compLiq_input").value = (parseFloat(a) - 0.05)
			.toString().replace(".", ",");
}

function calculoAltLiq() {

	a = document.getElementById("form:altBruta_input").value.replace(",", ".");

	document.getElementById("form:altLiq_input").value = (parseFloat(a) - 0.05)
			.toString().replace(".", ",");
}

function calculoMetragem() {

	a = document.getElementById("form:qtd_input").value.replace(",", ".");
	b = document.getElementById("form:compLiq_input").value.replace(",", ".");
	c = document.getElementById("form:altLiq_input").value.replace(",", ".");

	document.getElementById("form:met_input").value = (parseFloat(a)
			* parseFloat(b) * parseFloat(c)).toString().replace(".", ",");
}

function calculoValorDescReal() {

	a = document.getElementById("form:met_input").value.replace(",", ".");
	b = document.getElementById("form:valUnit_input").value.replace(",", ".");
	c = document.getElementById("form:descPorcent_input").value.replace(",",
			".");

	document.getElementById("form:descReal_input").value = ((parseFloat(b) * parseFloat(a)) * (parseFloat(c) / 100))
			.toString().replace(".", ",");
}

function calculoValorTot() {

	a = document.getElementById("form:met_input").value.replace(",", ".");
	b = document.getElementById("form:valUnit_input").value.replace(",", ".");
	c = document.getElementById("form:descReal_input").value
			.replace(",", ".");

	document.getElementById("form:valTot_input").value = (parseFloat(a)
			* parseFloat(b) - parseFloat(c)).toString().replace(".", ",");
}

function limparForm() {
	document.getElementById("form").reset();
}