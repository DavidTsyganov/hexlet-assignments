package exercise.servlet;

import exercise.Data;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static exercise.Data.getCompanies;

public class CompaniesServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                throws IOException, ServletException {
        PrintWriter printWriter = response.getWriter();
        List<String> companies = getCompanies();

        String searchString = request.getParameter("search") == null ? "" : request.getParameter("search");

        List<String> result = companies
                .stream()
                .filter((name) -> name.contains(searchString))
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            printWriter.println("Companies not found");
            return;
        }

        result.forEach(printWriter::println);
    }

}
