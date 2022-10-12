package top.xiaorang.design.pattern.state;

import javax.swing.*;
import java.awt.*;

/**
 * @author liulei
 * @description <p style = " font-weight:bold ; ">播放器的UI<p/>
 * @github <a href="https://github.com/xihuanxiaorang/design-pattern-study">design-pattern-study</a>
 * @Copyright 博客：<a href="https://xiaorang.top">小让的糖果屋</a>  - show me the code
 * @date 2022/10/12 8:19
 */
public class UI {
    private static final JTextField textField = new JTextField();
    private final Player player;

    public UI(Player player) {
        this.player = player;
    }

    public void init() {
        JFrame frame = new JFrame("网易云音乐");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);

        // Context delegates handling user's input to a state object. Naturally,
        // the outcome will depend on what state is currently active, since all
        // states can handle the input differently.
        JButton play = new JButton("Play");
        play.addActionListener(e -> textField.setText(player.getState().play()));
        JButton stop = new JButton("Stop");
        stop.addActionListener(e -> textField.setText(player.getState().stop()));
        JButton next = new JButton("Next");
        next.addActionListener(e -> textField.setText(player.getState().next()));
        JButton prev = new JButton("Prev");
        prev.addActionListener(e -> textField.setText(player.getState().prev()));
        frame.setVisible(true);
        frame.setSize(300, 100);
        buttons.add(play);
        buttons.add(stop);
        buttons.add(next);
        buttons.add(prev);
    }
}
