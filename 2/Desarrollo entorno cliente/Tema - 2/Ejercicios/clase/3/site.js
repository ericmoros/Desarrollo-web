var phones = new Array();
var ulPhones = null;
var formPhone = null;
var formButtonAdd = null;
var formPhoneError = null;

window.onload = function () {
  getElements();
  listenEvents();
  paintPhones();
  console.info("[Page loaded]");
};

function listenEvents() {
  formButtonAdd.addEventListener("click", function () {
    console.info("[Form button add clicked]");
    addPhone();
    paintPhones();
  });
  console.info("[Events listening]");
}

function checkPattern(str) {
  console.info("[Checking phone pattern]");
  var pattern = /^[0-9]{9}$/;
  var check = false;
  if (pattern.test(str)) check = true;
  console.info(check);
  return check;
}

function checkExists(str) {
  console.info("[Checking if phone don't exists]");
  check = true;
  if (phones.some(p => p.number == str)) check = false;
  console.info(check);
  return check;
}

function validatePhone(str) {
  console.info("[Validating phone]");
  var validation = false;

  if (checkPattern(str) && checkExists(str)) {
    validation = true;
    unPaintFormPhoneError();
  } else {
    paintFormPhoneError();
  }

  console.info(validation);
  return validation;
}

function addPhone() {
  var phone = new Object();
  phone.number = formPhone.value;
  if (validatePhone(phone.number)) {
    console.info("[Adding phone to array]");
    phone.painted = false;
    phones.push(phone);
    console.info(phone);
  }
}

function paintFormPhoneError() {
  if (formPhoneError.style.display != "inherit") {
    formPhoneError.style.display = "inherit";
  }
  console.info("[Painted form phone error]")
}

function unPaintFormPhoneError() {
  if (formPhoneError.style.display == "inherit") {
    formPhoneError.style.display = "none";
  }
  console.info("[Unpainted form phone error]")
}

function paintPhones() {
  console.info("[Painting phones]");
  phones.forEach(phone => {
    if (phone.painted == false) {
      ulPhones.innerHTML += `<li>${phone.number}</li>`;
      phone.painted = true;
      console.info(phone);
    }
  });
}

function getElements() {
  ulPhones = document.getElementById("ul-phones");
  formPhone = document.getElementById("form-phone");
  formPhoneError = document.getElementById("form-phone-error");
  formButtonAdd = document.getElementById("form-button-add");
  console.info("[Elements gotten]");
}
