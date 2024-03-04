import pygame, sys

# iniciando o pygame
pygame.init()

# definindo as cores
BLACK = (0,0,0,)
WHITE = (255,255,255)

# definindo o tamanho da tela 
SCREEN_WIDTH = 800
SCREEN_HEIGHT = 600
SCREEN_SIZE = (SCREEN_WIDTH, SCREEN_HEIGHT)
screen = pygame.display.set_mode(SCREEN_SIZE)
pygame.display.set_caption("Doctor Defense")

# definindo a classes do jogador (torre)
class Tower(pygame.sprite.Sprite):
    def __init__(self):
        super().__init__()
        self.image = pygame.Surface((50,50))
        self.image.fill(WHITE)
        self.rect = self.image.get_rect()
        self.rect.center = (SCREEN_WIDTH // 2, SCREEN_HEIGHT // 2)

        def update(self):
            pass

# definindo a classe do inimigo
        class Enemy(pygame.sprite.Sprite):
            def __init__(self):
             super().__init__()
        self.image = pygame.Surface((30,30))
        self.image.fill(255,0,0)
        self.rect = self.image.get_rect()
        self.rect.center = (100, SCREEN_HEIGHT // 2)
        self.speed = 2

    def update(self):
        self.rect.x += self.speed

# Criando um grupo para os sprites

all_sprites = pygame.sprite.Group()
enemies = pygame.sprite.Group()

# Criando a torre (jogador)
tower = Tower()
all_sprites.add(tower)

# Loop principal do jogo
running = True
while running:
    # Verificando eventos do jogo
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        #if event.type == pygame.KEYDOWN: 
           # if event.key == pygame.K_ESCAPE:
               # running = False
            
    # Atualizando os sprites
    all_sprites.update()

    # Desenhando 
    screen.fill(BLACK)
    all_sprites.draw(screen)

    # Atualizando a tela
    pygame.display.flip()

    # Controlando a velocidade do jogo
    pygame.time.Clock().tick(60)

    pygame.quit()
    sys.exit()

    # ACABOU BUCETA