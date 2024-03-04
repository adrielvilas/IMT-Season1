import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SkillTreeGame extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NODE_SIZE = 50;

    private SkillTreeNode selectedNode;

    public SkillTreeGame() {
        setTitle("Skill Tree Demo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        add(new SkillTreePanel());
    }

    private class SkillTreePanel extends JPanel {

        private SkillTreeNode root;

        public SkillTreePanel() {
            root = createSkillTree();
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    SkillTreeNode node = findNode(root, e.getX(), e.getY());
                    if (node != null) {
                        selectedNode = node;
                        repaint();
                    }
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawSkillTree(g, root, WIDTH / 2, 50, 0);
        }

        private void drawSkillTree(Graphics g, SkillTreeNode node, int x, int y, int depth) {
            int xOffset = (int) (Math.pow(2, depth) * NODE_SIZE);
            g.setColor(Color.BLACK);
            g.drawOval(x - NODE_SIZE / 2, y - NODE_SIZE / 2, NODE_SIZE, NODE_SIZE);
            g.drawString(node.getName(), x - 10, y + 5);

            if (node.getLeft() != null) {
                g.drawLine(x, y, x - xOffset, y + 100);
                drawSkillTree(g, node.getLeft(), x - xOffset, y + 100, depth + 1);
            }
            if (node.getRight() != null) {
                g.drawLine(x, y, x + xOffset, y + 100);
                drawSkillTree(g, node.getRight(), x + xOffset, y + 100, depth + 1);
            }

            if (node == selectedNode) {
                g.setColor(Color.RED);
                g.drawOval(x - NODE_SIZE / 2 - 3, y - NODE_SIZE / 2 - 3, NODE_SIZE + 6, NODE_SIZE + 6);
            }
        }

        private SkillTreeNode createSkillTree() {
            SkillTreeNode root = new SkillTreeNode("Root");
            SkillTreeNode left1 = new SkillTreeNode("Left 1");
            SkillTreeNode left2 = new SkillTreeNode("Left 2");
            SkillTreeNode right1 = new SkillTreeNode("Right 1");
            SkillTreeNode right2 = new SkillTreeNode("Right 2");

            root.setLeft(left1);
            root.setRight(right1);
            left1.setLeft(left2);
            right1.setRight(right2);

            return root;
        }

        private SkillTreeNode findNode(SkillTreeNode node, int x, int y) {
            if (node == null) return null;

            int nodeX = WIDTH / 2;
            int nodeY = 50;

            if (Math.pow(nodeX - x, 2) + Math.pow(nodeY - y, 2) <= Math.pow(NODE_SIZE / 2, 2)) {
                return node;
            }

            SkillTreeNode foundNode = findNode(node.getLeft(), x, y);
            if (foundNode != null) return foundNode;

            return findNode(node.getRight(), x, y);
        }
    }

    private class SkillTreeNode {
        private String name;
        private SkillTreeNode left;
        private SkillTreeNode right;

        public SkillTreeNode(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public SkillTreeNode getLeft() {
            return left;
        }

        public void setLeft(SkillTreeNode left) {
            this.left = left;
        }

        public SkillTreeNode getRight() {
            return right;
        }

        public void setRight(SkillTreeNode right) {
            this.right = right;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SkillTreeGame game = new SkillTreeGame();
            game.setVisible(true);
        });
    }
}