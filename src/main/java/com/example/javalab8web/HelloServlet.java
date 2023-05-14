package com.example.javalab8web;
/*
*010001
* 12 вариант
* 1) Программный код вычисляемой функции разместить: 0 - на «Главной странице», 1 –
в классе Bean-компоненты.
* 0) Заголовки страниц должны иметь следующий вид: 0 – «Стартовая страница»,
«Главная страница» и «Финишная страница»; 1 - «Раз», «Два» и «Три».
* 0) Формат «Стартовой страницы»: 0 – содержит текст задания на лабораторную работу,
ФИО студента и ссылку для перехода на «Главную страницу», 1 – содержит текст
задания на лабораторную работу, группа студента и кнопку для перехода на
«Главную страницу».
* 0) Организовать вывод результатов работы функции на «Финишной странице»: 0 -
строки следуют одна за другой сверху вниз (таблица без видимых границ, состоящая
из одного столбца и множества строк); 1 – результаты должны быть каким-то
образом размещены в видимой таблице, в таблице допускается произвольное число
столбцов и строк
* 1) При повторном переходе на «Главную страницу», например при нажатии кнопки
«Возврат» на «Финишной странице», на «Главной странице» должно отображаться: 0
– изменение триггера, размещённого на «Главной странице»; 0 – изменение триггера,
размещённого в Bean-компоненте; 1 – изменение счётчика, размещённого на
«Главной странице»; 2 – изменение счётчика, размещённого в Bean-компоненте; 3 –
общее число переходов (обновлений) страниц Web-приложения.
*
*
*
*
*
*/
import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}