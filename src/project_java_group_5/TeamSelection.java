package project_java_group_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeamSelection extends JFrame {
    public TeamSelection() {
        setTitle("Select Team");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo các nút
        JButton btnTeam1 = new JButton("Team 1");
        JButton btnTeam2 = new JButton("Team 2");
        JButton btnBack = new JButton("Back");

        // Xử lý khi chọn Team 1
        btnTeam1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewCauThu.view(1); // Truy cập đội 1
                dispose();
            }
        });

        // Xử lý khi chọn Team 2
        btnTeam2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewCauThu.view(2); // Truy cập đội 2
                dispose();
            }
        });

        // Xử lý khi nhấn Back
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Quay lại menu chính
                dispose();
                int role = Login.phanQuyen();
                if (role == 0) {
                    new Menu();
                } else {
                    Login.setFlag(9);
                    Login.view();
                }
            }
        });

        // Bố trí giao diện
        setLayout(new GridLayout(3, 1, 10, 10)); // Thêm hàng cho nút Back
        add(btnTeam1);
        add(btnTeam2);
        add(btnBack);

        setVisible(true);
    }

    // Gọi giao diện này từ nơi khác
    public static void view() {
        new TeamSelection();
    }
}
