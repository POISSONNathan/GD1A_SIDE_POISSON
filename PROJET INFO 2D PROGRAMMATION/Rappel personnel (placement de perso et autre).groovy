player = this.physics.add.sprite(83,895, 'persoDebut') 

// start tuto

player = this.physics.add.sprite(13890,670, 'persoDebut') 


// spawn debut zone 2
player = this.physics.add.sprite(3000,460, 'persoDebut')

// spawn après 1e TP

 player = this.physics.add.sprite(6000,600, 'persoDebut')   

 // spawn après 2e TP

 player = this.physics.add.sprite(10510,600, 'persoDebut')   

// format jeu 
width: 768, height: 432,

// format test 
width: 1366, height: 768,



oxyTexte = this.add.text(540, 20, tauxOxy, {
                fontSize: "24px",
                fill: "#FFFFFF" 
            });
            oxyTexte.setScrollFactor(0);
            

hpTexte = this.add.text(500, 55,pointDeVie, {
                fontSize: "24px",
                fill: "#FFFFFF" 
            });
            hpTexte.setScrollFactor(0);
hpTexte.setText(pointDeVie); 

//clique pour une action
if (game.input.activerPointer.isDown){
    instructions
}

