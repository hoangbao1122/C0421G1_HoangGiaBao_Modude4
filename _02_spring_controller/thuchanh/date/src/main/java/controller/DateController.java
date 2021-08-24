package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class DateController {
    @GetMapping("clock")
    public String getTimeClock(Model model, @RequestParam(name = "city", required = false, defaultValue = "Đà Nắng") String city) {
        Date date = new Date();
        TimeZone local   = TimeZone.getDefault();
        TimeZone locale  = TimeZone.getTimeZone(city);
        // Tính thời gian hiện tại của một thành phố cụ thể
        long locale_time = date.getTime() +
                (local.getRawOffset() - locale.getRawOffset());
        // Cài đặt lại thời gian cho biến date thành thời gian hiện tại của 1 thành phố cụ thể
        date.setTime(locale_time);
        model.addAttribute("city",city);
        model.addAttribute("date",date);
        return "list";
    }
}
