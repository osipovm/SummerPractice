<!DOCTYPE html>
<html>
<head>
    <title>MedCalcs</title>
</head>
<body>
<a href="/">Главная страница</a></h1><br>
Натрий корригированный относительно уровня гипергликемии<br>
<#list calcs as calc>
    <div>
        <p>
            <b>${calc.id}</b> ${calc.natriy} ${calc.glucoza} ${calc.calculation}
        </p>
    </div>
</#list>


<hr>
<h3>Создать</h3>

<form action="/natriycalc/сalculate" method="post">
    Глюкоза, ммоль/л: <input type="number" name="natriy" required="" min=0 step="0.1"/><br><br>
    Натрий, ммоль/л: <input type="number" name="glucoza" required="" min=0 step="0.1"/><br><br>
    <input type="submit" value="Расчитать"/>
</form>
<br>
Об этом калькуляторе
Калькулятор для расчета действительного уровня натрия у пацентов с гипергликемией

Формула
Корригированный натрий (Hillier, 1999) = Измеренный натрий + 0.024 * (Глюкоза сыворотки - 100)

Дополнительные сведения
Гипергликемия вызывает перемещение жидкости из внутриклеточного компартмента во внеклеточный. Это приводит к дилютационной гипонатрийемии.

В 1999 году Hillier и соавторы пересчитали классический коэффициент Katz (1973). Вместо коэффициента равного 1.6 сейчас принято считать его равным 2.4.
</body>
</html>
