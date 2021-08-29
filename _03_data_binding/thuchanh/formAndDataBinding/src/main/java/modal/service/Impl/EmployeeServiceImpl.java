package modal.service.Impl;

import modal.bean.Employee;
import modal.service.IEmployee;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployee {
    private static List<Employee> list = null;

    static {
        list = new ArrayList<>();
        list.add(new Employee(1,"hoangbao","123456789"));
    }

    @Override
    public List<Employee> listAll() {
        return list;
    }
}
