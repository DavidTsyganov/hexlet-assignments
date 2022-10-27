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
        String query = request.getQueryString();
        PrintWriter printWriter = response.getWriter();
        List<String> result = new ArrayList<>();

        if (query == null || query.isEmpty()) {
            printWriter.write(formatter(Data.getCompanies()));
            return;
        }

        String searchParameter = request.getParameter("search");

        if (searchParameter == null || searchParameter.isEmpty()) {
            printWriter.write(formatter(Data.getCompanies()));
        } else {
            result = checkCompanies(Data.getCompanies(), searchParameter);

            if (result.isEmpty()) {
                printWriter.write("Companies not found");
            } else {
                printWriter.write(formatter(result));
            }
        }
        printWriter.close();
    }

    public List<String> checkCompanies(List<String> companies, String param) {
        List<String> result = new ArrayList<>();

        result = companies.stream()
                .filter((name) -> name.contains(param))
                .collect(Collectors.toList());

        return result;
    }

    public static String formatter(List<String> result) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String name : result) {
            stringBuilder.append(name);
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }

}
