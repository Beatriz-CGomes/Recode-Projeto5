import styles from '../project/ProjetForm.module.css'
import Api from '../../Api'
import { useEffect } from 'react';
import { useState} from 'react';
import { useRef} from 'react';
import axios from 'axios';

function Reserva() {
    const Reserva= () => {
        const [reservar, setReservar] = useState([])
        
      }
      useEffect(() =>  {
         Api.get('/reservas')
          .then((res) => console.long(res.data))
         .catch((erro) => console.long(erro))
      }, [])
      const nome = useRef()
      const cpf = useRef()
      const celular = useRef()
      const email = useRef()
      const origem = useRef()
      const destino = useRef()
      const entrada = useRef()
      const saída = useRef()
    
      function enviarDados(event){
        console.log('tre')
    
    
        Api.post('/', {
            nome: nome.current.value,
            cpf: cpf.current.value,
            celular: celular.current.value,
            email: email.current.value,
            origem: origem.current.value,
            destino: destino.current.value,
            entrada: entrada.current.value,
            saída: saída.current.value
        
        }).then((res) => console.log(res)).catch((erro) => console.long(erro))
      }
    return (

        <>
            <form action="Confirma"  onSubmit={enviarDados}>
                <fieldset>

                    <legend>Reservar</legend>

                    <div class="container">

                        <strong><label for="Nome">Nome:</label></strong>
                        <input type="text" name="Nome:" placeholder="Nome:" size="30"  ref={nome}/>


                        <strong> <label for="CPF">CPF:</label></strong>
                        <input type="number:" name="CPF:" placeholder="CPF:" size="11" ref={cpf} />



                        <strong><label for="number">Celular:</label></strong>
                        <input type="number" name="number"  placeholder="Celular:" size="15" ref={celular} />

                        <strong><label for="text">Email:</label></strong>
                        <input type="text" name="text"  placeholder="Email:" size="30" ref={email}/>
<br></br>
                        <strong><label for="Origem">Origem:</label></strong>
                        <input type="text" name="Origem:" placeholder="Origem:" size="30"  ref={origem}/>


                        <strong> <label for="Destino">Destino:</label></strong>
                        <input type="text:" name="Destino:" placeholder="Destino:" size="30" ref={destino} />



                        <strong><label for="data">Entrada:</label></strong>
                        <input type="date" name="data"  ref={entrada} />

                        <strong><label for="data">Saída:</label></strong>
                        <input type="date" name="data" ref={saída} />

                    </div>

                    <br></br>
                    <div class="enviar">
                        <input type="submit" name="enviar" value="Enviar" />
                        <input type="reset" name="limpar" value="Limpar" />
                    </div>
                </fieldset>
            </form>


        </>


    )
}

export default Reserva;