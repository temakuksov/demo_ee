<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8"/>
    <title>Куксов Артем Сергеевич</title>
</head>
<body>
<h1>Куксов Артем Сергеевич</h1>
<p> 42 года</p>
<p><i>Едва ли можно достичь подлинного понимания, опираясь на объяснения других<br>
    (Миямото Мусаси - Книга пяти колец. Путь стратегии, XVII век)</i></p>
<h2>О себе</h2>
<p>Хобби: Музыка (гитарист группы), спорт (бег, функциональный тренинг), фотография, путешествия, здоровье.</p>
<p>Обладаю навыками работы в команде, планирования деятельности и стремлением к повышению квалификации. Опыт публичных выступлений (доклады на форумах, концерты). Быстро погружаюсь в задачи. С коллегами по работе общителен и дружелюбен. Эмоционально сдержан и спокоен. Не курю. Не женат.</p>
<br>
<hr>
<%
    Date dNow = new Date( );
    SimpleDateFormat ft =
            new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
    out.print( "<h4 align=\"left\"> Сегодня: " + ft.format(dNow) + "</h4>");
%>
</body>
</html>
