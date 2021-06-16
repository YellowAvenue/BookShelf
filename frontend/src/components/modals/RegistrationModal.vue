<template>
  <div>
    <div class="overlay" data-close=""></div>
    <div id="registration" class="dlg-modal" >
      <form name = "registration" @submit="complete_registration();">
        <div class="container" >
          <h1 style="text-align: center">Регистрация</h1>
          <!--                <hr>-->
          <label style="padding: 10px; font-size: x-large;"><b>ФИО:</b></label>
          <br>
          <input type="text"
                 placeholder="Иванов Иван Иванович"
                 pattern="[А-яа-я]+[ ][А-яа-я]+[ ][А-яа-я]+"
                 title="Введите кириллицой имя фамилию отчество разделяя слова пробелами."
                 required=""
                 class="input-field">
          <br>
          <label><b>Возраст</b></label>
          <br>
          <input type="text"
                 placeholder="19"
                 pattern="^(?:1[01][0-9]|120|1[4-9]|[2-9][0-9])$"
                 required=""
                 title="Введите возраст от 14 до 120"
                 class="input-field">
          <br>
          <label><b>Номер телефона</b></label>
          <br>
          <input type="tel"
                 placeholder="+79104479731"
                 pattern="[\+]?[0-9]{11}"
                 required=""
                 class="input-field">
          <br>
          <label><b>Страна</b></label>
          <br>
          <input type="text"
                 placeholder="Россия"
                 pattern="[А-яа-я]+"
                 required=""
                 class="input-field">
          <br>
          <label><b>Город</b></label>
          <br>
          <input type="text"
                 placeholder="Москва"
                 pattern="[А-яа-я]+"
                 required=""
                 class="input-field">
          <label><b>Улица</b></label>
          <br>
          <input type="text"
                 placeholder="Книжная"
                 pattern="[А-яа-я]+"
                 required=""
                 class="input-field">
          <br>
          <label><b>Дом</b></label>
          <br>
          <input type="text"
                 placeholder="54"
                 pattern="[0-9]+"
                 required=""
                 class="input-field">
          <br>
          <label><b>Квартира</b></label>
          <br>
          <input type="text"
                 placeholder="33"
                 pattern="[0-9]+"
                 required=""
                 class="input-field">
          <br>
          <label><b>Корпус/Строение (Если нет, оставьте пустым)</b></label>
          <br>
          <input type="text"
                 placeholder="11"
                 pattern="[0-9]+"
                 class="input-field">
          <br>
          <div class="clearfix" style="padding-top: 20px;">
            <button type="reset"
                    class="btn btn-dark"
                    title = "Нажмите, чтобы очистить все поля"
                    style="color:#feb386;margin-bottom: 15px;">Cброс</button>
            <button type = "submit" class="btn btn-dark"
                    title = "Нажмите, чтобы подтвердить свои данные"
                    style="color:#feb386; margin-bottom: 15px;">Купить</button>
          </div>
        </div>
      </form>
    </div>
  </div>
</template>

<script>
export default {
  name: "RegistrationModal"
}
</script>

<style scoped>

</style>