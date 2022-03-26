import styles from '../project/ProjetForm.module.css'
import Api from '../../Api'
import { useEffect } from 'react';
import { useState} from 'react';
import { useRef} from 'react';
import axios from 'axios';




function ProjectForm() {

  const ProjectForm = () => {
    const [consultar, setConsultar] = useState([])
    
  }
  useEffect(() =>  {
     Api.get('/consultas')
      .then((res) => console.long(res.data))
     .catch((erro) => console.long(erro))
  }, [])
  const origem = useRef()
  const destino = useRef()
  const entrada = useRef()
  const saída = useRef()

  function enviarDados(event){
    console.log('tre')


    Api.post('/', {
      origem: origem.current.value,
      destino: destino.current.value,
      entrada: entrada.current.value,
      saída: saída.current.value
    
    }).then((res) => console.log(res)).catch((erro) => console.long(erro))
  }

    return (

<>
<form action="Confirma" method="get" enctype = "multipart/form-data" autocomplete="on" onSubmit={enviarDados}>
    <fieldset>
  
      <legend>Buscar pacotes </legend>

      <div class="input1">
  
     <strong><label for="Origem">Origem:</label></strong> 
            <input type="text" name="Origem:" placeholder="Origem:" size="30" ref={origem} />

  
            <strong> <label for="Destino">Destino:</label></strong> 
 <input type="text:" name="Destino:" placeholder="Destino:" size="30" ref={destino}/>


  
 <strong><label for="data">Entrada:</label></strong>
  <input type = "date" name = "data"  ref={entrada} />

<strong><label for="data">Saída:</label></strong>
  <input type = "date" name = "data" ref={saída} />

</div>
        
  <br></br>
  <div class="input">
  <input type="submit" name="enviar" value="Enviar" />
  <input type="reset"  name="limpar" value="Limpar"/>
</div>
  </fieldset>
  </form>

  </>
        )
    }
    
    export default ProjectForm;