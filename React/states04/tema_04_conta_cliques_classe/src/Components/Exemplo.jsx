return (  
    <div>  
        <p>Você clicou {this.state.contador} vezes</p>  
        <button  
            onClick={() =>  
                this.setState({ contador: this.state.contador + 1 })  
            }  
        >  
            Clique aqui  
        </button>
    </div>  
);  
