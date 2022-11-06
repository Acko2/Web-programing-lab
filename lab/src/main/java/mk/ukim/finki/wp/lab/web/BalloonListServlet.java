package mk.ukim.finki.wp.lab.web;

import mk.ukim.finki.wp.lab.service.BalloonService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "BalloonListServlet", value = "/BalloonListServlet")
public class BalloonListServlet extends HttpServlet {

    private final BalloonService balloonService;

    public BalloonListServlet(BalloonService balloonService){
        this.balloonService = balloonService;
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
